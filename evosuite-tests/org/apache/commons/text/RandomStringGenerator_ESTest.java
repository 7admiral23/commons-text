/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 01:27:26 GMT 2024
 */

package org.apache.commons.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.text.CharacterPredicate;
import org.apache.commons.text.RandomStringGenerator;
import org.apache.commons.text.TextRandomProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RandomStringGenerator_ESTest extends RandomStringGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      RandomStringGenerator randomStringGenerator0 = randomStringGenerator_Builder0.build();
      // Undeclared exception!
      try { 
        randomStringGenerator0.generate(0, 1114111);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      // Undeclared exception!
      try { 
        randomStringGenerator_Builder0.withinRange(2180, 2180);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      char[][] charArray0 = new char[2][9];
      char[] charArray1 = new char[0];
      charArray0[0] = charArray1;
      // Undeclared exception!
      try { 
        randomStringGenerator_Builder0.withinRange(charArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = new RandomStringGenerator.Builder();
      CharacterPredicate[] characterPredicateArray0 = new CharacterPredicate[4];
      // Undeclared exception!
      try { 
        randomStringGenerator_Builder0.filteredBy(characterPredicateArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/ArrayUtils
         //
         verifyException("org.apache.commons.text.RandomStringGenerator$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = new RandomStringGenerator.Builder();
      RandomStringGenerator randomStringGenerator0 = randomStringGenerator_Builder0.build();
      // Undeclared exception!
      try { 
        randomStringGenerator0.generate(1229, (-3936));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      RandomStringGenerator randomStringGenerator0 = randomStringGenerator_Builder0.build();
      // Undeclared exception!
      try { 
        randomStringGenerator0.generate((-1988), (-1988));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      RandomStringGenerator randomStringGenerator0 = randomStringGenerator_Builder0.build();
      // Undeclared exception!
      try { 
        randomStringGenerator0.generate((-1661));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = new RandomStringGenerator.Builder();
      RandomStringGenerator randomStringGenerator0 = randomStringGenerator_Builder0.build();
      String string0 = randomStringGenerator0.generate(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      // Undeclared exception!
      try { 
        randomStringGenerator_Builder0.withinRange(0, 1114111);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      // Undeclared exception!
      try { 
        randomStringGenerator_Builder0.withinRange(1114111, 0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      char[][] charArray0 = new char[6][5];
      // Undeclared exception!
      try { 
        randomStringGenerator_Builder0.withinRange(charArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      char[][] charArray0 = new char[1][2];
      // Undeclared exception!
      try { 
        randomStringGenerator_Builder0.withinRange(charArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = new RandomStringGenerator.Builder();
      char[][] charArray0 = new char[0][6];
      RandomStringGenerator.Builder randomStringGenerator_Builder1 = randomStringGenerator_Builder0.withinRange(charArray0);
      assertSame(randomStringGenerator_Builder0, randomStringGenerator_Builder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      RandomStringGenerator.Builder randomStringGenerator_Builder1 = randomStringGenerator_Builder0.withinRange((char[][]) null);
      assertSame(randomStringGenerator_Builder0, randomStringGenerator_Builder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      char[] charArray0 = new char[1];
      RandomStringGenerator.Builder randomStringGenerator_Builder1 = randomStringGenerator_Builder0.selectFrom(charArray0);
      assertSame(randomStringGenerator_Builder1, randomStringGenerator_Builder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      RandomStringGenerator.Builder randomStringGenerator_Builder1 = randomStringGenerator_Builder0.selectFrom((char[]) null);
      assertEquals(0, RandomStringGenerator.Builder.DEFAULT_LENGTH);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = RandomStringGenerator.builder();
      TextRandomProvider textRandomProvider0 = mock(TextRandomProvider.class, new ViolatedAssumptionAnswer());
      RandomStringGenerator.Builder randomStringGenerator_Builder1 = randomStringGenerator_Builder0.usingRandom(textRandomProvider0);
      assertSame(randomStringGenerator_Builder1, randomStringGenerator_Builder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RandomStringGenerator.Builder randomStringGenerator_Builder0 = new RandomStringGenerator.Builder();
      RandomStringGenerator randomStringGenerator0 = randomStringGenerator_Builder0.build();
      // Undeclared exception!
      try { 
        randomStringGenerator0.generate(1114111);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.apache.commons.text.RandomStringGenerator", e);
      }
  }
}
