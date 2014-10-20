package abstractFactory3;

import static org.junit.Assert.*;

import org.junit.Test;

public class abstractFactory3Test {
	Factory1 f = new Factory1();
	
	@Test
	public void testCreateProduct2() {
		f.createProductB().getName();
		fail("Not yet implemented");
	}

	@Test
	public void testCteateProduct1() {
		ProductA1 p1 = (ProductA1) f.cteateProductA();
		assertEquals("product A1", p1.getName());
		fail("Not yet implemented");
	}

}
