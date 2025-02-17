/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 00:37:38 GMT 2024
 */

package org.apache.commons.text.lookup;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.apache.commons.text.lookup.BiStringLookup;
import org.apache.commons.text.lookup.FunctionStringLookup;
import org.apache.commons.text.lookup.InterpolatorStringLookup;
import org.apache.commons.text.lookup.StringLookup;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringLookupFactory_ESTest extends StringLookupFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Properties properties0 = new Properties();
      BiFunction<Object, Object, Boolean> biFunction0 = (BiFunction<Object, Object, Boolean>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      properties0.merge("org.apache.commons.text.lookup.StringLookupFactory.defaultStringLookups", ":", biFunction0);
      StringLookupFactory.DefaultStringLookupsHolder stringLookupFactory_DefaultStringLookupsHolder0 = null;
      try {
        stringLookupFactory_DefaultStringLookupsHolder0 = new StringLookupFactory.DefaultStringLookupsHolder(properties0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid default string lookups definition: :
         //
         verifyException("org.apache.commons.text.lookup.StringLookupFactory$DefaultStringLookupsHolder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("env", "xml");
      Map<String, String> map0 = StringLookupFactory.toMap((Map<String, String>) hashMap0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringLookupFactory.toKey("dns");
      assertEquals("dns", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringLookupFactory.toKey("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      InterpolatorStringLookup interpolatorStringLookup0 = new InterpolatorStringLookup((Map<String, Boolean>) null);
      Map<String, StringLookup> map0 = interpolatorStringLookup0.getStringLookupMap();
      FunctionStringLookup<String> functionStringLookup0 = StringLookupFactory.INSTANCE_BASE64_DECODER;
      StringLookup stringLookup0 = stringLookupFactory0.INSTANCE.interpolatorStringLookup(map0, (StringLookup) functionStringLookup0, false);
      assertNotSame(interpolatorStringLookup0, stringLookup0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      // Undeclared exception!
      try { 
        stringLookupFactory0.xmlStringLookup((Map<String, Boolean>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // xPathFfactoryFeatures
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringLookupFactory.toKey((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.text.lookup.StringLookupFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      Properties properties0 = new Properties();
      StringLookupFactory.DefaultStringLookupsHolder stringLookupFactory_DefaultStringLookupsHolder0 = new StringLookupFactory.DefaultStringLookupsHolder(properties0);
      Map<String, StringLookup> map0 = stringLookupFactory_DefaultStringLookupsHolder0.getDefaultStringLookups();
      // Undeclared exception!
      try { 
        stringLookupFactory0.addDefaultStringLookups(map0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.base64StringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.nullStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      stringLookupFactory0.addDefaultStringLookups((Map<String, StringLookup>) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Properties properties0 = new Properties();
      BiFunction<Object, Object, Boolean> biFunction0 = (BiFunction<Object, Object, Boolean>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      properties0.merge("org.apache.commons.text.lookup.StringLookupFactory.defaultStringLookups", "", biFunction0);
      StringLookupFactory.DefaultStringLookupsHolder stringLookupFactory_DefaultStringLookupsHolder0 = new StringLookupFactory.DefaultStringLookupsHolder(properties0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.javaPlatformStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.systemPropertyStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.base64EncoderStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.dateStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.urlStringLookup();
      StringLookup stringLookup1 = stringLookupFactory0.interpolatorStringLookup(stringLookup0);
      assertNotNull(stringLookup1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.localHostStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.resourceBundleStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.urlDecoderStringLookup();
      // Undeclared exception!
      try { 
        stringLookupFactory0.interpolatorStringLookup((Map<String, StringLookup>) null, stringLookup0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.text.lookup.InterpolatorStringLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.constantStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      BiStringLookup<String> biStringLookup0 = stringLookupFactory0.biFunctionStringLookup((BiFunction<String, String, String>) null);
      assertNotNull(biStringLookup0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.interpolatorStringLookup((Map<String, FunctionStringLookup<FunctionStringLookup>>) null);
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.scriptStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      StringLookup stringLookup0 = stringLookupFactory0.xmlStringLookup((Map<String, Boolean>) hashMap0);
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringLookupFactory.clear();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.functionStringLookup((Function<String, FunctionStringLookup<Object>>) null);
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.xmlEncoderStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      HashMap<String, FunctionStringLookup<Boolean>> hashMap0 = new HashMap<String, FunctionStringLookup<Boolean>>();
      StringLookup stringLookup0 = stringLookupFactory0.mapStringLookup((Map<String, FunctionStringLookup<Boolean>>) hashMap0);
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.xmlDecoderStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.base64DecoderStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.dnsStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.propertiesStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.xmlStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.environmentVariableStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.urlEncoderStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.resourceBundleStringLookup("java");
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.interpolatorStringLookup();
      assertNotNull(stringLookup0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringLookupFactory stringLookupFactory0 = StringLookupFactory.INSTANCE;
      StringLookup stringLookup0 = stringLookupFactory0.fileStringLookup();
      assertNotNull(stringLookup0);
  }
}
