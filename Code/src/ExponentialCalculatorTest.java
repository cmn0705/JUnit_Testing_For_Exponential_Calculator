import static org.junit.Assert.*;

import org.junit.Test;

public class ExponentialCalculatorTest {

	@Test
	public void test1() {
		ExponentialCalculator one= new ExponentialCalculator();
	    assertTrue(one.pow(1,5)==1);
	}
	@Test
	public void test2() {
		ExponentialCalculator two= new ExponentialCalculator();
	    assertTrue(two.pow(5,7)==78125);
	}
	@Test
	public void test3() {
		ExponentialCalculator three= new ExponentialCalculator();
	    assertTrue(three.pow(0,0)==1);
	}
	@Test
	public void test4() {
		ExponentialCalculator four= new ExponentialCalculator();
	    assertTrue(four.pow(8,0)==1);
	}
	@Test
	public void test5() {
		ExponentialCalculator five= new ExponentialCalculator();
	    assertTrue(five.pow(2,-2)==0.25);
	}

}
