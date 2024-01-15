/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jan 15 00:59:36 GMT 2024
 */

package org.apache.commons.text.io;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class StringSubstitutorReader_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.text.io.StringSubstitutorReader"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/media/admiral/ADMIRAL/Documents/UNISA/SwD/January/commons-text"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StringSubstitutorReader_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.text.Builder",
      "org.apache.commons.text.matcher.AbstractStringMatcher",
      "org.apache.commons.text.TextStringBuilder$TextStringBuilderReader",
      "org.apache.commons.text.StringTokenizer",
      "org.apache.commons.text.TextStringBuilder",
      "org.apache.commons.text.matcher.StringMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharSetMatcher",
      "org.apache.commons.text.io.StringSubstitutorReader",
      "org.apache.commons.text.matcher.AbstractStringMatcher$NoneMatcher",
      "org.apache.commons.text.StringSubstitutor",
      "org.apache.commons.text.matcher.StringMatcherFactory",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$TrimMatcher",
      "org.apache.commons.text.TextStringBuilder$TextStringBuilderTokenizer",
      "org.apache.commons.text.TextStringBuilder$TextStringBuilderWriter",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharArrayMatcher"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StringSubstitutorReader_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.text.io.StringSubstitutorReader",
      "org.apache.commons.text.matcher.AbstractStringMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$NoneMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$CharSetMatcher",
      "org.apache.commons.text.matcher.AbstractStringMatcher$TrimMatcher",
      "org.apache.commons.text.matcher.StringMatcherFactory",
      "org.apache.commons.text.TextStringBuilder",
      "org.apache.commons.text.StringSubstitutor",
      "org.apache.commons.text.TextStringBuilder$TextStringBuilderReader",
      "org.apache.commons.text.TextStringBuilder$TextStringBuilderWriter"
    );
  }
}
