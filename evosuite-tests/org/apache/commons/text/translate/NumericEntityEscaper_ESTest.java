/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:13:38 GMT 2024
 */

package org.apache.commons.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.text.translate.NumericEntityEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NumericEntityEscaper_ESTest extends NumericEntityEscaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumericEntityEscaper.between((-1040), 0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Range
         //
         verifyException("org.apache.commons.text.translate.NumericEntityEscaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumericEntityEscaper.outsideOf((-2103), (-2103));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Range
         //
         verifyException("org.apache.commons.text.translate.NumericEntityEscaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = null;
      try {
        numericEntityEscaper0 = new NumericEntityEscaper();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Range
         //
         verifyException("org.apache.commons.text.translate.NumericEntityEscaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumericEntityEscaper.below(0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Range
         //
         verifyException("org.apache.commons.text.translate.NumericEntityEscaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumericEntityEscaper.above((-1419));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Range
         //
         verifyException("org.apache.commons.text.translate.NumericEntityEscaper", e);
      }
  }
}
