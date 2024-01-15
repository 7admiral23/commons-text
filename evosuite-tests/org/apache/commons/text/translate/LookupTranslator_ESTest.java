/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:12:30 GMT 2024
 */

package org.apache.commons.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.translate.LookupTranslator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LookupTranslator_ESTest extends LookupTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      CharBuffer charBuffer0 = CharBuffer.allocate(44);
      hashMap0.put(charBuffer0, "2C");
      LookupTranslator lookupTranslator0 = new LookupTranslator(hashMap0);
      StringWriter stringWriter0 = new StringWriter(44);
      int int0 = lookupTranslator0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals("2C", stringWriter0.toString());
      assertEquals(44, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      CharBuffer charBuffer0 = CharBuffer.allocate(3560);
      hashMap0.put(charBuffer0, charBuffer0);
      CharSequence charSequence0 = hashMap0.put(charBuffer0, charBuffer0);
      hashMap0.put("DE8", charSequence0);
      LookupTranslator lookupTranslator0 = new LookupTranslator(hashMap0);
      StringWriter stringWriter0 = new StringWriter(3149);
      int int0 = lookupTranslator0.translate(charSequence0, 1, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      hashMap0.put(charBuffer0, charBuffer0);
      hashMap0.put("A", "A");
      LookupTranslator lookupTranslator0 = new LookupTranslator(hashMap0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      LookupTranslator lookupTranslator0 = new LookupTranslator(hashMap0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        lookupTranslator0.translate((CharSequence) stringBuffer0, 2947, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LookupTranslator lookupTranslator0 = new LookupTranslator(hashMap0);
      StringWriter stringWriter0 = new StringWriter(457);
      // Undeclared exception!
      try { 
        lookupTranslator0.translate((CharSequence) charBuffer0, 457, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      hashMap0.put(stringBuffer0, stringBuffer0);
      LookupTranslator lookupTranslator0 = null;
      try {
        lookupTranslator0 = new LookupTranslator(hashMap0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      hashMap0.put((CharSequence) null, (CharSequence) null);
      LookupTranslator lookupTranslator0 = null;
      try {
        lookupTranslator0 = new LookupTranslator(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.text.translate.LookupTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      StringWriter stringWriter0 = new StringWriter(97);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      hashMap0.put(charBuffer0, stringBuffer0);
      LookupTranslator lookupTranslator0 = null;
      try {
        lookupTranslator0 = new LookupTranslator(hashMap0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      StringWriter stringWriter0 = new StringWriter(0);
      LookupTranslator lookupTranslator0 = new LookupTranslator(hashMap0);
      int int0 = lookupTranslator0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      hashMap0.put(charBuffer0, charBuffer0);
      hashMap0.put("FFFFFF18", "FFFFFF18");
      LookupTranslator lookupTranslator0 = new LookupTranslator(hashMap0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LookupTranslator lookupTranslator0 = null;
      try {
        lookupTranslator0 = new LookupTranslator((Map<CharSequence, CharSequence>) null);
        fail("Expecting exception: InvalidParameterException");
      
      } catch(InvalidParameterException e) {
         //
         // lookupMap cannot be null
         //
         verifyException("org.apache.commons.text.translate.LookupTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<CharSequence, CharSequence> hashMap0 = new HashMap<CharSequence, CharSequence>();
      LookupTranslator lookupTranslator0 = new LookupTranslator(hashMap0);
      StringWriter stringWriter0 = new StringWriter(3149);
      // Undeclared exception!
      try { 
        lookupTranslator0.translate((CharSequence) null, (-2842), (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.text.translate.LookupTranslator", e);
      }
  }
}
