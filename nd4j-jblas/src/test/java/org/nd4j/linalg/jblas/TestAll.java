package org.nd4j.linalg.jblas;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 3/9/15 7:31 PM
 * @author Mohit
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BlasWrapperTest.class,
	JblasNDArrayFactoryTest.class,
	NDArrayTest.class,
	org.nd4j.linalg.jblas.activations.TestAll.class,
	org.nd4j.linalg.jblas.benchmark.TestAll.class,
	org.nd4j.linalg.jblas.complex.TestAll.class,
	org.nd4j.linalg.jblas.convolution.TestAll.class,
	org.nd4j.linalg.jblas.dataset.TestAll.class,
	org.nd4j.linalg.jblas.factory.TestAll.class,
	org.nd4j.linalg.jblas.indexing.TestAll.class,
	org.nd4j.linalg.jblas.io.TestAll.class,
	org.nd4j.linalg.jblas.lossfunctions.TestAll.class,
	org.nd4j.linalg.jblas.util.TestAll.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/9/15 7:31 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
