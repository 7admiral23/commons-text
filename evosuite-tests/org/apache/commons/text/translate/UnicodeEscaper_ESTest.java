/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:18:23 GMT 2024
 */

package org.apache.commons.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.text.translate.JavaUnicodeEscaper;
import org.apache.commons.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnicodeEscaper_ESTest extends UnicodeEscaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 1);
      StringWriter stringWriter0 = new StringWriter();
      boolean boolean0 = unicodeEscaper0.translate((-840), (Writer) stringWriter0);
      assertEquals("\\uFCB8", stringWriter0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter(65535);
      boolean boolean0 = unicodeEscaper0.translate(65535, (Writer) stringWriter0);
      assertEquals("\\uFFFF", stringWriter0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(637);
      StringWriter stringWriter0 = new StringWriter(0);
      boolean boolean0 = unicodeEscaper0.translate(637, (Writer) stringWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 1);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = unicodeEscaper0.translate((CharSequence) "\uFFFFFCB8", 1, (Writer) stringWriter0);
      assertEquals("\\u0046", stringWriter0.toString());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter(65535);
      boolean boolean0 = unicodeEscaper0.translate(Integer.MAX_VALUE, (Writer) stringWriter0);
      assertEquals("\\u7FFFFFFF", stringWriter0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(Integer.MAX_VALUE, (-110));
      StringWriter stringWriter0 = new StringWriter();
      boolean boolean0 = unicodeEscaper0.translate(Integer.MAX_VALUE, (Writer) stringWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate(1553, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.text.translate.UnicodeEscaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JavaUnicodeEscaper javaUnicodeEscaper0 = JavaUnicodeEscaper.above((-1044));
      // Undeclared exception!
      try { 
        javaUnicodeEscaper0.toUtf16Escape((-1044));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not a valid Unicode code point: 0xFFFFFBEC
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JavaUnicodeEscaper javaUnicodeEscaper0 = JavaUnicodeEscaper.below(65535);
      // Undeclared exception!
      try { 
        javaUnicodeEscaper0.toUtf16Escape(65535);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("org.apache.commons.text.translate.JavaUnicodeEscaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-9), (-9));
      StringWriter stringWriter0 = new StringWriter();
      boolean boolean0 = unicodeEscaper0.translate((-9), (Writer) stringWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper((-22), (-22), true);
      Writer writer0 = Writer.nullWriter();
      boolean boolean0 = unicodeEscaper0.translate(Integer.MAX_VALUE, writer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      Writer writer0 = Writer.nullWriter();
      boolean boolean0 = unicodeEscaper0.translate((-1210), writer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(916);
      assertNotNull(unicodeEscaper0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.toUtf16Escape(3572);
      assertEquals("\\uDF4", string0);
  }
}
