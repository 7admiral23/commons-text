/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:00:46 GMT 2024
 */

package org.apache.commons.text;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.apache.commons.text.StrLookup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StrLookup_ESTest extends StrLookup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrLookup.MapStrLookup<String> strLookup_MapStrLookup0 = new StrLookup.MapStrLookup<String>(hashMap0);
      String string0 = strLookup_MapStrLookup0.lookup("Invalid text");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      String string0 = strLookup0.lookup("Dso:Zu");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      StrLookup<String> strLookup0 = StrLookup.resourceBundleLookup(propertyResourceBundle0);
      String string0 = strLookup0.lookup("i");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(byteArrayInputStream0);
      StrLookup<String> strLookup0 = StrLookup.resourceBundleLookup(propertyResourceBundle0);
      String string0 = strLookup0.lookup("0NB*MFm#$Z$Xy");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.resourceBundleLookup((ResourceBundle) null);
      String string0 = strLookup0.lookup("]");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StrLookup<ByteArrayInputStream> strLookup0 = StrLookup.mapLookup((Map<String, ByteArrayInputStream>) null);
      assertNotNull(strLookup0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(byteArrayInputStream0);
      StrLookup<String> strLookup0 = StrLookup.resourceBundleLookup(propertyResourceBundle0);
      String string0 = strLookup0.lookup((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StrLookup<?> strLookup0 = StrLookup.noneLookup();
      assertNotNull(strLookup0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StrLookup<String> strLookup0 = StrLookup.systemPropertiesLookup();
      String string0 = strLookup0.lookup("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrLookup.MapStrLookup<Object> strLookup_MapStrLookup0 = new StrLookup.MapStrLookup<Object>(hashMap0);
      String string0 = strLookup_MapStrLookup0.toString();
      assertNotNull(string0);
  }
}
