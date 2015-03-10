package org.nd4j.linalg.solvers;

import org.junit.*;
import static org.junit.Assert.*;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.solvers.api.OptimizableByGradientValueMatrix;

/**
 * The class <code>VectorizedBackTrackLineSearchMinimumTest</code> contains tests for the class <code>{@link VectorizedBackTrackLineSearchMinimum}</code>.
 *
 * @generatedBy CodePro at 3/9/15 7:28 PM
 * @author Mohit
 * @version $Revision: 1.0 $
 */
public class VectorizedBackTrackLineSearchMinimumTest {
	/**
	 * Run the VectorizedBackTrackLineSearchMinimum(OptimizableByGradientValueMatrix) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testVectorizedBackTrackLineSearchMinimum_1()
		throws Exception {
		OptimizableByGradientValueMatrix optimizable = null;

		VectorizedBackTrackLineSearchMinimum result = new VectorizedBackTrackLineSearchMinimum(optimizable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
		//       at java.net.URLClassLoader$1.run(Unknown Source)
		//       at java.net.URLClassLoader$1.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the double getStpmax() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testGetStpmax_1()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);

		double result = fixture.getStpmax();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_1()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_2()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_3()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_4()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_5()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_6()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_7()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_8()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_9()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_10()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_11()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_12()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double optimize(INDArray,int,INDArray,INDArray) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testOptimize_13()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		INDArray line = null;
		int lineSearchIteration = 1;
		INDArray g = null;
		INDArray params = null;

		double result = fixture.optimize(line, lineSearchIteration, g, params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the void setAbsTolx(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testSetAbsTolx_1()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		double tolx = 1.0;

		fixture.setAbsTolx(tolx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
	}

	/**
	 * Run the void setRelTolx(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testSetRelTolx_1()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		double tolx = 1.0;

		fixture.setRelTolx(tolx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
	}

	/**
	 * Run the void setStpmax(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 7:28 PM
	 */
	@Test
	public void testSetStpmax_1()
		throws Exception {
		VectorizedBackTrackLineSearchMinimum fixture = new VectorizedBackTrackLineSearchMinimum((OptimizableByGradientValueMatrix) null);
		fixture.setStpmax(1.0);
		fixture.setRelTolx(1.0);
		fixture.setAbsTolx(1.0);
		double stpmax = 1.0;

		fixture.setStpmax(stpmax);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: org.nd4j.linalg.solvers.VectorizedBackTrackLineSearchMinimum
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
		new org.junit.runner.JUnitCore().run(VectorizedBackTrackLineSearchMinimumTest.class);
	}
}