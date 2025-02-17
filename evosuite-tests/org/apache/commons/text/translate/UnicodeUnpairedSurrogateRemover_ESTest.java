/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:19:50 GMT 2024
 */

package org.apache.commons.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.text.translate.UnicodeUnpairedSurrogateRemover;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnicodeUnpairedSurrogateRemover_ESTest extends UnicodeUnpairedSurrogateRemover_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      Writer writer0 = Writer.nullWriter();
      boolean boolean0 = unicodeUnpairedSurrogateRemover0.translate(55296, writer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      StringWriter stringWriter0 = new StringWriter(57343);
      boolean boolean0 = unicodeUnpairedSurrogateRemover0.translate(65535, (Writer) stringWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      Writer writer0 = Writer.nullWriter();
      boolean boolean0 = unicodeUnpairedSurrogateRemover0.translate(57343, writer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnicodeUnpairedSurrogateRemover unicodeUnpairedSurrogateRemover0 = new UnicodeUnpairedSurrogateRemover();
      Writer writer0 = Writer.nullWriter();
      boolean boolean0 = unicodeUnpairedSurrogateRemover0.translate(354, writer0);
      assertFalse(boolean0);
  }
}
