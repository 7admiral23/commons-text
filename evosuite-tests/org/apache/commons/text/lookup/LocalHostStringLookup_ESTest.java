/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 00:32:10 GMT 2024
 */

package org.apache.commons.text.lookup;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.text.lookup.LocalHostStringLookup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocalHostStringLookup_ESTest extends LocalHostStringLookup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalHostStringLookup localHostStringLookup0 = LocalHostStringLookup.INSTANCE;
      // Undeclared exception!
      try { 
        localHostStringLookup0.lookup("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("org.apache.commons.text.lookup.LocalHostStringLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalHostStringLookup localHostStringLookup0 = LocalHostStringLookup.INSTANCE;
      String string0 = localHostStringLookup0.lookup("name");
      assertEquals("192.168.1.42", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalHostStringLookup localHostStringLookup0 = LocalHostStringLookup.INSTANCE;
      String string0 = localHostStringLookup0.lookup("address");
      assertEquals("192.168.1.42", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalHostStringLookup localHostStringLookup0 = LocalHostStringLookup.INSTANCE;
      String string0 = localHostStringLookup0.lookup((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LocalHostStringLookup localHostStringLookup0 = LocalHostStringLookup.INSTANCE;
      String string0 = localHostStringLookup0.lookup("canonical-name");
      assertEquals("192.168.1.42", string0);
  }
}
