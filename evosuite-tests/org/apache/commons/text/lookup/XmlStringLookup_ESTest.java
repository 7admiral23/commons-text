/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 00:44:41 GMT 2024
 */

package org.apache.commons.text.lookup;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.lookup.XmlStringLookup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XmlStringLookup_ESTest extends XmlStringLookup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlStringLookup xmlStringLookup0 = null;
      try {
        xmlStringLookup0 = new XmlStringLookup((Map<String, Boolean>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // xPathFfactoryFeatures
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlStringLookup xmlStringLookup0 = XmlStringLookup.INSTANCE;
      // Undeclared exception!
      try { 
        xmlStringLookup0.lookup("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad XML key format []; expected format is DocumentPath:XPath.
         //
         verifyException("org.apache.commons.text.lookup.IllegalArgumentExceptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlStringLookup xmlStringLookup0 = XmlStringLookup.INSTANCE;
      String string0 = xmlStringLookup0.lookup((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlStringLookup xmlStringLookup0 = XmlStringLookup.INSTANCE;
      // Undeclared exception!
      try { 
        xmlStringLookup0.lookup("]_fk=8Yf:%h$W");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.apache.commons.text.lookup.XmlStringLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      XmlStringLookup xmlStringLookup0 = new XmlStringLookup(hashMap0);
      // Undeclared exception!
      try { 
        xmlStringLookup0.lookup("]]:,=:]]:,=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad XML key format []]:,=:]]:,=]; expected format is DocumentPath:XPath.
         //
         verifyException("org.apache.commons.text.lookup.IllegalArgumentExceptions", e);
      }
  }
}
