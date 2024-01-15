/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:33:28 GMT 2024
 */

package org.apache.commons.text.similarity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.util.Locale;
import org.apache.commons.text.similarity.FuzzyScore;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FuzzyScore_ESTest extends FuzzyScore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      FuzzyScore fuzzyScore0 = new FuzzyScore(locale0);
      Integer integer0 = fuzzyScore0.fuzzyScore("ja-JP", "A_}");
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FuzzyScore fuzzyScore0 = new FuzzyScore(locale0);
      CharBuffer charBuffer0 = CharBuffer.allocate(3677);
      fuzzyScore0.fuzzyScore(charBuffer0, charBuffer0);
      // Undeclared exception!
      fuzzyScore0.fuzzyScore(charBuffer0, charBuffer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FuzzyScore fuzzyScore0 = new FuzzyScore(locale0);
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.append('4');
      // Undeclared exception!
      try { 
        fuzzyScore0.fuzzyScore("rL6AYn&VWZ|3BFRk+", charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Locale locale0 = new Locale("A_o", "8\"(", "A_o");
      FuzzyScore fuzzyScore0 = new FuzzyScore(locale0);
      Integer integer0 = fuzzyScore0.fuzzyScore("A_o", "8\"(");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale locale0 = new Locale("A_}", "");
      FuzzyScore fuzzyScore0 = new FuzzyScore(locale0);
      // Undeclared exception!
      try { 
        fuzzyScore0.fuzzyScore("A_}", (CharSequence) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // CharSequences must not be null
         //
         verifyException("org.apache.commons.text.similarity.FuzzyScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FuzzyScore fuzzyScore0 = new FuzzyScore(locale0);
      // Undeclared exception!
      try { 
        fuzzyScore0.fuzzyScore((CharSequence) null, (CharSequence) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // CharSequences must not be null
         //
         verifyException("org.apache.commons.text.similarity.FuzzyScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FuzzyScore fuzzyScore0 = null;
      try {
        fuzzyScore0 = new FuzzyScore((Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Locale must not be null
         //
         verifyException("org.apache.commons.text.similarity.FuzzyScore", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FuzzyScore fuzzyScore0 = new FuzzyScore(locale0);
      Locale locale1 = fuzzyScore0.getLocale();
      assertEquals("zho", locale1.getISO3Language());
  }
}
