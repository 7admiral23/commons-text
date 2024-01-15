/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:38:17 GMT 2024
 */

package org.apache.commons.text.similarity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.apache.commons.text.similarity.JaccardDistance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JaccardDistance_ESTest extends JaccardDistance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JaccardDistance jaccardDistance0 = new JaccardDistance();
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0, 0, 0);
      charBuffer1.clear();
      CharBuffer charBuffer2 = charBuffer1.get(charArray0);
      Double double0 = jaccardDistance0.apply(charBuffer2, charBuffer0);
      assertEquals(1.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JaccardDistance jaccardDistance0 = new JaccardDistance();
      CharBuffer charBuffer0 = CharBuffer.allocate(1403);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.flip();
      // Undeclared exception!
      try { 
        jaccardDistance0.apply(charBuffer1, charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JaccardDistance jaccardDistance0 = new JaccardDistance();
      CharBuffer charBuffer0 = CharBuffer.allocate(6167);
      jaccardDistance0.apply(charBuffer0, charBuffer0);
      // Undeclared exception!
      jaccardDistance0.apply(charBuffer0, charBuffer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JaccardDistance jaccardDistance0 = new JaccardDistance();
      CharBuffer charBuffer0 = CharBuffer.allocate(2648);
      // Undeclared exception!
      try { 
        jaccardDistance0.apply(charBuffer0, (CharSequence) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input cannot be null
         //
         verifyException("org.apache.commons.text.similarity.JaccardDistance", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JaccardDistance jaccardDistance0 = new JaccardDistance();
      // Undeclared exception!
      try { 
        jaccardDistance0.apply((CharSequence) null, (CharSequence) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input cannot be null
         //
         verifyException("org.apache.commons.text.similarity.JaccardDistance", e);
      }
  }
}
