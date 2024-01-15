/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:32:01 GMT 2024
 */

package org.apache.commons.text.similarity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.text.similarity.EditDistance;
import org.apache.commons.text.similarity.EditDistanceFrom;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EditDistanceFrom_ESTest extends EditDistanceFrom_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenshteinDistance levenshteinDistance0 = LevenshteinDistance.getDefaultInstance();
      EditDistanceFrom<Integer> editDistanceFrom0 = null;
      try {
        editDistanceFrom0 = new EditDistanceFrom<Integer>(levenshteinDistance0, (CharSequence) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.similarity.EditDistanceFrom", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EditDistanceFrom<Integer> editDistanceFrom0 = null;
      try {
        editDistanceFrom0 = new EditDistanceFrom<Integer>((EditDistance<Integer>) null, (CharSequence) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.similarity.EditDistanceFrom", e);
      }
  }
}
