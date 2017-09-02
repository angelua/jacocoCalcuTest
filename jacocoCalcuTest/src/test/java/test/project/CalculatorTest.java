package test.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for Jacoco calcu test.
 */
public class CalculatorTest 
    extends TestCase
{
	private Calculator jacocoCalcuTest;
	
	@Before
	  public void setUp() throws Exception {
	    this.jacocoCalcuTest = new Calculator();
	  }

	  @After
	  public void tearDown() throws Exception {
		  jacocoCalcuTest = null;
	  }

	  @Test
	  public void testSumaNumeroPositivos() {
	    assertEquals("Suma", 7.0, jacocoCalcuTest.sumar(3, 4));
	  }
	  
	  @Test
	  public void testRestaNumeroPositivos() {
	    assertEquals("Resta", 3.0, jacocoCalcuTest.restar(4, 1));
	  }
	  
	  @Test
	  public void testDivideNumeroPositivos() {
	    assertEquals("Division", 3.0, jacocoCalcuTest.dividir(15, 5));
	  }
	  
	  @Test
	  public void testMultiplicaNumeroPositivos() {
	    assertEquals("Suma", 12.0, jacocoCalcuTest.multiplicar(3, 4));
	  }
}
