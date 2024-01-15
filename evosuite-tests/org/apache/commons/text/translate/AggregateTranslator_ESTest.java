/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:04:58 GMT 2024
 */

package org.apache.commons.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.text.translate.AggregateTranslator;
import org.apache.commons.text.translate.CharSequenceTranslator;
import org.apache.commons.text.translate.CsvTranslators;
import org.apache.commons.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AggregateTranslator_ESTest extends AggregateTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[8];
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below((-43));
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "FFFFFFD5", (-43), (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(0);
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) null, 0, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      CsvTranslators.CsvEscaper csvTranslators_CsvEscaper0 = new CsvTranslators.CsvEscaper();
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) csvTranslators_CsvEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.apache.commons.text.translate.CsvTranslators$CsvEscaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(946);
      CharBuffer charBuffer0 = CharBuffer.allocate(946);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0, 946, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(53);
      StringWriter stringWriter0 = new StringWriter();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      CsvTranslators.CsvEscaper csvTranslators_CsvEscaper0 = new CsvTranslators.CsvEscaper();
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) csvTranslators_CsvEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0, 53, (Writer) stringWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // CsvEscaper.translate(final CharSequence input, final int index, final Writer out) can not handle a non-zero index.
         //
         verifyException("org.apache.commons.text.translate.SinglePassTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[6];
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 0);
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = aggregateTranslator0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
      assertEquals("\\u0030", stringWriter0.toString());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[6];
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(0);
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = aggregateTranslator0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
  }
}
