/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:02:08 GMT 2024
 */

package org.apache.commons.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StrMatcher_ESTest extends StrMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      char[] charArray0 = new char[8];
      charArray0[1] = ' ';
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 1, (-13), 222);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher(" G3.mA{IbN |n=eLQ");
      char[] charArray0 = new char[1];
      charArray0[0] = 'I';
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 0, 647, 911);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[8];
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("");
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 1, 1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = 'L';
      charArray0[2] = '1';
      charArray0[3] = '1';
      charArray0[4] = 'K';
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      int int0 = strMatcher_CharSetMatcher0.isMatch(charArray0, 0, (-1), 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charMatcher('F');
      char[] charArray0 = new char[2];
      charArray0[1] = 'H';
      int int0 = strMatcher0.isMatch(charArray0, 1, 1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      char[] charArray0 = new char[8];
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 1, (-13), 222);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[5];
      StrMatcher.CharSetMatcher strMatcher_CharSetMatcher0 = new StrMatcher.CharSetMatcher(charArray0);
      int int0 = strMatcher_CharSetMatcher0.isMatch(charArray0, 0, 0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[13];
      StrMatcher strMatcher0 = StrMatcher.trimMatcher();
      int int0 = strMatcher0.isMatch(charArray0, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      // Undeclared exception!
      try { 
        strMatcher0.isMatch((char[]) null, (-4397), (-4397), (-4397));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.text.StrMatcher$CharSetMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.noneMatcher();
      // Undeclared exception!
      try { 
        strMatcher0.isMatch((char[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.text.StrMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        StrMatcher.charSetMatcher(charArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/ArrayUtils
         //
         verifyException("org.apache.commons.text.StrMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher((String) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((String) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("f");
      char[] charArray0 = new char[7];
      charArray0[0] = 'f';
      int int0 = strMatcher0.isMatch(charArray0, 0, 615, 615);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("'\"");
      char[] charArray0 = new char[10];
      int int0 = strMatcher_StringMatcher0.isMatch(charArray0, 1, 1, 32);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrMatcher.CharMatcher strMatcher_CharMatcher0 = new StrMatcher.CharMatcher('M');
      char[] charArray0 = new char[3];
      charArray0[0] = 'M';
      int int0 = strMatcher_CharMatcher0.isMatch(charArray0, 0, 2256, 44);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[7];
      StrMatcher strMatcher0 = StrMatcher.tabMatcher();
      int int0 = strMatcher0.isMatch(charArray0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrMatcher.NoMatcher strMatcher_NoMatcher0 = new StrMatcher.NoMatcher();
      char[] charArray0 = new char[6];
      int int0 = strMatcher_NoMatcher0.isMatch(charArray0, 291, 291, 9);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.stringMatcher("f");
      char[] charArray0 = new char[7];
      int int0 = strMatcher0.isMatch(charArray0, 407);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.singleQuoteMatcher();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        strMatcher0.isMatch(charArray0, 119, 119, 119);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 119 out of bounds for length 0
         //
         verifyException("org.apache.commons.text.StrMatcher$CharMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.splitMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.spaceMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.doubleQuoteMatcher();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        strMatcher0.isMatch(charArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.apache.commons.text.StrMatcher$CharMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      char[] charArray0 = new char[1];
      int int0 = strMatcher0.isMatch(charArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.commaMatcher();
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrMatcher.StringMatcher strMatcher_StringMatcher0 = new StrMatcher.StringMatcher("org.apache.commons.text.StrMatcher$NoMatcher");
      String string0 = strMatcher_StringMatcher0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StrMatcher.TrimMatcher strMatcher_TrimMatcher0 = new StrMatcher.TrimMatcher();
      char[] charArray0 = new char[1];
      charArray0[0] = 'f';
      int int0 = strMatcher_TrimMatcher0.isMatch(charArray0, 0, (-981), 2266);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("W");
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("KR,|P5~");
      assertNotNull(strMatcher0);
  }
}
