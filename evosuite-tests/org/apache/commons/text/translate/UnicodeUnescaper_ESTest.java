/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:19:39 GMT 2024
 */

package org.apache.commons.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnicodeUnescaper_ESTest extends UnicodeUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('\\');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      StringWriter stringWriter2 = stringWriter1.append('u');
      StringWriter stringWriter3 = stringWriter2.append('u');
      StringWriter stringWriter4 = stringWriter3.append('\\');
      stringWriter4.append((CharSequence) stringBuffer0);
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to parse unicode value: \\\\uu
         //
         verifyException("org.apache.commons.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('\\');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      StringWriter stringWriter2 = stringWriter1.append('u');
      stringWriter2.append('y');
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Less than 4 hex digits in unicode value: '\\uy' due to end of CharSequence
         //
         verifyException("org.apache.commons.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('\\');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      stringWriter1.write((-2342));
      int int0 = unicodeUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      char[] charArray0 = new char[6];
      charArray0[0] = '{';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(0);
      int int0 = unicodeUnescaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) stringBuffer0, 94, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, (-781), (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) charBuffer0, (-1), (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('\\');
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      StringWriter stringWriter2 = stringWriter1.append('u');
      stringWriter2.write("+LXmc");
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to parse unicode value: LXmc
         //
         verifyException("org.apache.commons.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('\\');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      stringWriter1.append('u');
      stringWriter1.append('u');
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Less than 4 hex digits in unicode value: '\\uu' due to end of CharSequence
         //
         verifyException("org.apache.commons.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('\\');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      stringWriter1.append('u');
      StringWriter stringWriter2 = stringWriter1.append('%');
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Less than 4 hex digits in unicode value: '\\u%' due to end of CharSequence
         //
         verifyException("org.apache.commons.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('\\');
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      stringWriter1.append('\\');
      int int0 = unicodeUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('\\');
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      int int0 = unicodeUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      int int0 = unicodeUnescaper0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }
}
