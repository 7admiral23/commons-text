/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:45:11 GMT 2024
 */

package org.apache.commons.text.similarity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LevenshteinDistance_ESTest extends LevenshteinDistance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.allocate(951);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance();
      Integer integer0 = levenshteinDistance0.apply(charBuffer0, charBuffer1);
      assertEquals(950, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      char[] charArray0 = new char[2];
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      LevenshteinDistance levenshteinDistance0 = LevenshteinDistance.getDefaultInstance();
      Integer integer0 = levenshteinDistance0.apply(charBuffer0, charBuffer1);
      assertEquals(2, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Integer integer0 = new Integer(1712);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      CharBuffer charBuffer1 = CharBuffer.allocate(1712);
      charBuffer1.append('^');
      Integer integer1 = levenshteinDistance0.apply(charBuffer1, charBuffer0);
      assertEquals(1711, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(1694);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put(charArray0);
      CharBuffer charBuffer1 = CharBuffer.allocate(1694);
      Integer integer1 = levenshteinDistance0.apply(charBuffer0, charBuffer1);
      assertEquals(1694, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      Integer integer0 = new Integer(1260);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      Integer integer1 = levenshteinDistance0.apply(charBuffer0, charBuffer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      Integer integer1 = levenshteinDistance0.getThreshold();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevenshteinDistance levenshteinDistance0 = LevenshteinDistance.getDefaultInstance();
      Integer integer0 = levenshteinDistance0.getThreshold();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-1356));
      LevenshteinDistance levenshteinDistance0 = null;
      try {
        levenshteinDistance0 = new LevenshteinDistance(integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Threshold must not be negative
         //
         verifyException("org.apache.commons.text.similarity.LevenshteinDistance", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevenshteinDistance levenshteinDistance0 = LevenshteinDistance.getDefaultInstance();
      char[] charArray0 = new char[7];
      charArray0[0] = 'e';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Integer integer0 = levenshteinDistance0.apply(charBuffer0, charBuffer0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance();
      CharBuffer charBuffer1 = CharBuffer.allocate(3092);
      Integer integer0 = levenshteinDistance0.apply(charBuffer1, charBuffer0);
      assertEquals(3091, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      charBuffer1.put(charArray0);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance();
      Integer integer0 = levenshteinDistance0.apply(charBuffer0, charBuffer1);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance();
      // Undeclared exception!
      try { 
        levenshteinDistance0.apply(charBuffer0, (CharSequence) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // CharSequences must not be null
         //
         verifyException("org.apache.commons.text.similarity.LevenshteinDistance", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'e';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Integer integer0 = Integer.getInteger("=cthcPPvF h@~|V~a", 578);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      Integer integer1 = levenshteinDistance0.apply(charBuffer0, charBuffer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Integer integer1 = levenshteinDistance0.apply(charBuffer0, charBuffer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(Integer.MAX_VALUE);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      CharBuffer charBuffer0 = CharBuffer.allocate(977);
      // Undeclared exception!
      levenshteinDistance0.apply(charBuffer0, charBuffer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(1);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      Integer integer1 = levenshteinDistance0.apply(charBuffer0, "Threshold must not be negative");
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Integer integer0 = new Integer(1716);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      CharBuffer charBuffer1 = CharBuffer.allocate(1716);
      Integer integer1 = levenshteinDistance0.apply(charBuffer1, charBuffer0);
      assertEquals(1715, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.allocate(0);
      Integer integer1 = levenshteinDistance0.apply(charBuffer0, charBuffer1);
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Integer integer0 = new Integer(1712);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      CharBuffer charBuffer1 = CharBuffer.allocate(1712);
      Integer integer1 = levenshteinDistance0.apply(charBuffer1, charBuffer0);
      assertEquals(1712, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      CharBuffer charBuffer1 = CharBuffer.allocate(511);
      Integer integer1 = levenshteinDistance0.apply(charBuffer0, charBuffer1);
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      // Undeclared exception!
      try { 
        levenshteinDistance0.apply(charBuffer0, (CharSequence) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // CharSequences must not be null
         //
         verifyException("org.apache.commons.text.similarity.LevenshteinDistance", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      // Undeclared exception!
      try { 
        levenshteinDistance0.apply((CharSequence) null, (CharSequence) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // CharSequences must not be null
         //
         verifyException("org.apache.commons.text.similarity.LevenshteinDistance", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(1712);
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance(integer0);
      Integer integer1 = levenshteinDistance0.getThreshold();
      assertEquals(1712, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LevenshteinDistance levenshteinDistance0 = new LevenshteinDistance();
      // Undeclared exception!
      try { 
        levenshteinDistance0.apply((CharSequence) null, (CharSequence) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // CharSequences must not be null
         //
         verifyException("org.apache.commons.text.similarity.LevenshteinDistance", e);
      }
  }
}
