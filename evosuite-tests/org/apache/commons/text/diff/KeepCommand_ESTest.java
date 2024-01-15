/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 15 00:51:25 GMT 2024
 */

package org.apache.commons.text.diff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.text.diff.CommandVisitor;
import org.apache.commons.text.diff.KeepCommand;
import org.apache.commons.text.diff.ReplacementsFinder;
import org.apache.commons.text.diff.ReplacementsHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KeepCommand_ESTest extends KeepCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-3127));
      KeepCommand<Integer> keepCommand0 = new KeepCommand<Integer>(integer0);
      // Undeclared exception!
      try { 
        keepCommand0.accept((CommandVisitor<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.text.diff.KeepCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-157));
      KeepCommand<Integer> keepCommand0 = new KeepCommand<Integer>(integer0);
      ReplacementsHandler<Integer> replacementsHandler0 = (ReplacementsHandler<Integer>) mock(ReplacementsHandler.class, new ViolatedAssumptionAnswer());
      ReplacementsFinder<Integer> replacementsFinder0 = new ReplacementsFinder<Integer>(replacementsHandler0);
      keepCommand0.accept(replacementsFinder0);
  }
}
