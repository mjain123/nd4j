package org.nd4j.linalg.ops.factory.impl;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.ops.ElementWiseOp;

/**
 * The class <code>NegativeElementWiseOpFactoryTest</code> contains tests for the class <code>{@link NegativeElementWiseOpFactory}</code>.
 *
 * @generatedBy CodePro at 3/9/15 7:28 PM
 * @author Mohit
 * @version $Revision: 1.0 $
 */
public class NegativeElementWiseOpFactoryTest {
	/**
	 * Run the NegativeElementWiseOpFactory() constructor test.
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testNegativeElementWiseOpFactory_1()
		throws Exception {
		NegativeElementWiseOpFactory result = new NegativeElementWiseOpFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ElementWiseOp create() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testCreate_1()
		throws Exception {
		NegativeElementWiseOpFactory fixture = new NegativeElementWiseOpFactory();

		ElementWiseOp result = fixture.create();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.ops.factory.impl.NegativeElementWiseOpFactory
		//       at java.net.URLClassLoader$1.run(Unknown Source)
		//       at java.net.URLClassLoader$1.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:544)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NegativeElementWiseOpFactoryTest.class);
	}
}