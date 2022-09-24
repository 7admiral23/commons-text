/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.text.similarity;

import java.util.Arrays;

/**
 * Measures the Jaro-Winkler distance of two character sequences.
 * It is the complementary of Jaro-Winkler similarity.
 *
 * @since 1.0
 */
public class JaroWinklerDistance implements EditDistance<Double> {

    /**
     * @deprecated Deprecated as of 1.7. This constant will be removed in 2.0.
     */
    @Deprecated
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * This method returns the Jaro-Winkler string matches, half transpositions, prefix array.
     *
     * @param first the first string to be matched
     * @param second the second string to be matched
     * @return mtp array containing: matches, half transpositions, and prefix
     * @deprecated Deprecated as of 1.7. This method will be removed in 2.0, and moved to a Jaro Winkler similarity
     *             class. TODO see TEXT-104.
     */
    @Deprecated
    protected static int[] matches(final CharSequence first, final CharSequence second) {
        final CharSequence max;
        final CharSequence min;
        if (first.length() > second.length()) {
            max = first;
            min = second;
        } else {
            max = second;
            min = first;
        }
        final int range = Math.max(max.length() / 2 - 1, 0);
        final int[] matchIndexes = new int[min.length()];
        Arrays.fill(matchIndexes, -1);
        final boolean[] matchFlags = new boolean[max.length()];
        int matches = 0;
        for (int mi = 0; mi < min.length(); mi++) {
            final char c1 = min.charAt(mi);
            for (int xi = Math.max(mi - range, 0), xn = Math.min(mi + range + 1, max.length()); xi < xn; xi++) {
                if (!matchFlags[xi] && c1 == max.charAt(xi)) {
                    matchIndexes[mi] = xi;
                    matchFlags[xi] = true;
                    matches++;
                    break;
                }
            }
        }
        final char[] ms1 = new char[matches];
        final char[] ms2 = new char[matches];
        for (int i = 0, si = 0; i < min.length(); i++) {
            if (matchIndexes[i] != -1) {
                ms1[si] = min.charAt(i);
                si++;
            }
        }
        for (int i = 0, si = 0; i < max.length(); i++) {
            if (matchFlags[i]) {
                ms2[si] = max.charAt(i);
                si++;
            }
        }
        int halfTranspositions = 0;
        for (int mi = 0; mi < ms1.length; mi++) {
            if (ms1[mi] != ms2[mi]) {
                halfTranspositions++;
            }
        }
        int prefix = 0;
        for (int mi = 0; mi < Math.min(4, min.length()); mi++) {
            if (first.charAt(mi) != second.charAt(mi)) {
                break;
            }
            prefix++;
        }
        return new int[] {matches, halfTranspositions, prefix};
    }

    /**
     * Jaro Winkler similarity object used to calculate the distance (1 - similarity).
     */
    private final JaroWinklerSimilarity similarity = new JaroWinklerSimilarity();

    /**
     * Computes the Jaro Winkler Distance between two character sequences.
     *
     * <pre>
     * distance.apply(null, null)          = IllegalArgumentException
     * distance.apply("foo", null)         = IllegalArgumentException
     * distance.apply(null, "foo")         = IllegalArgumentException
     * distance.apply("", "")              = 0.0
     * distance.apply("foo", "foo")        = 0.0
     * distance.apply("foo", "foo ")       = 0.06
     * distance.apply("foo", "foo  ")      = 0.09
     * distance.apply("foo", " foo ")      = 0.13
     * distance.apply("foo", "  foo")      = 0.49
     * distance.apply("", "a")             = 1.0
     * distance.apply("aaapppp", "")       = 1.0
     * distance.apply("frog", "fog")       = 0.07
     * distance.apply("fly", "ant")        = 1.0
     * distance.apply("elephant", "hippo") = 0.56
     * distance.apply("hippo", "elephant") = 0.56
     * distance.apply("hippo", "zzzzzzzz") = 1.0
     * distance.apply("hello", "hallo")    = 0.12
     * distance.apply("ABC Corporation", "ABC Corp") = 0.09
     * distance.apply("D N H Enterprises Inc", "D &amp; H Enterprises, Inc.") = 0.05
     * distance.apply("My Gym Children's Fitness Center", "My Gym. Childrens Fitness") = 0.08
     * distance.apply("PENNSYLVANIA", "PENNCISYLVNIA") = 0.12
     * </pre>
     *
     * @param left the first CharSequence, must not be null
     * @param right the second CharSequence, must not be null
     * @return result distance
     * @throws IllegalArgumentException if either CharSequence input is {@code null}
     */
    @Override
    public Double apply(final CharSequence left, final CharSequence right) {

        if (left == null || right == null) {
            throw new IllegalArgumentException("CharSequences must not be null");
        }

        return 1 - similarity.apply(left, right);
    }
}
