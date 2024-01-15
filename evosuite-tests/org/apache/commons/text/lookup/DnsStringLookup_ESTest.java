/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 00:23:38 GMT 2024
 */

package org.apache.commons.text.lookup;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.text.lookup.DnsStringLookup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DnsStringLookup_ESTest extends DnsStringLookup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DnsStringLookup dnsStringLookup0 = DnsStringLookup.INSTANCE;
      String string0 = dnsStringLookup0.lookup("DGc3_j$Qmdf|6EWCNUQ");
      assertEquals("200.42.42.0", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DnsStringLookup dnsStringLookup0 = DnsStringLookup.INSTANCE;
      // Undeclared exception!
      try { 
        dnsStringLookup0.lookup("|");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.apache.commons.text.lookup.DnsStringLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DnsStringLookup dnsStringLookup0 = DnsStringLookup.INSTANCE;
      String string0 = dnsStringLookup0.lookup("canonical-name");
      assertEquals("200.42.42.0", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DnsStringLookup dnsStringLookup0 = DnsStringLookup.INSTANCE;
      String string0 = dnsStringLookup0.lookup("address");
      assertEquals("200.42.42.0", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DnsStringLookup dnsStringLookup0 = DnsStringLookup.INSTANCE;
      String string0 = dnsStringLookup0.lookup("|<8{2Q|aGV_(ZC|:addresscanonical-name");
      assertEquals("200.42.42.0", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DnsStringLookup dnsStringLookup0 = DnsStringLookup.INSTANCE;
      String string0 = dnsStringLookup0.lookup((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DnsStringLookup dnsStringLookup0 = DnsStringLookup.INSTANCE;
      String string0 = dnsStringLookup0.lookup("name");
      assertEquals("200.42.42.0", string0);
  }
}
