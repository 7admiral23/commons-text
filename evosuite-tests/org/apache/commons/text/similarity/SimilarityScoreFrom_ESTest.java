/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:51:15 GMT 2024
 */

package org.apache.commons.text.similarity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.apache.commons.text.similarity.SimilarityScore;
import org.apache.commons.text.similarity.SimilarityScoreFrom;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimilarityScoreFrom_ESTest extends SimilarityScoreFrom_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance();
      SimilarityScoreFrom<Integer> similarityScoreFrom0 = null;
      try {
        similarityScoreFrom0 = new SimilarityScoreFrom<Integer>(levenshteinDistance0, (CharSequence) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.similarity.SimilarityScoreFrom", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimilarityScoreFrom<Object> similarityScoreFrom0 = null;
      try {
        similarityScoreFrom0 = new SimilarityScoreFrom<Object>((SimilarityScore<Object>) null, (CharSequence) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.similarity.SimilarityScoreFrom", e);
      }
  }
}
