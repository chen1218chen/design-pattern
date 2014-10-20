package abstractFactory2;

import static org.junit.Assert.*;

import org.junit.Test;

public class abstractFactory2Test {
	Factory f = new Factory();
	
	@Test
	public void testCreateProduct2() {
		f.createProduct2().getName();
		fail("Not yet implemented");
	}

	@Test
	public void testCteateProduct1() {
		
		Product1 p1 = (Product1) f.cteateProduct1();
		assertEquals("product 1", p1.getName());
		fail("Not yet implemented");
	}

}
