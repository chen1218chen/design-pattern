package abstractFactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbstractTest {

	@Test
	public void testCreateProduct() {
		ConcreteFactory f = new ConcreteFactory();
		Product p = f.createProduct(ConcreteProduct.class);
		assertEquals("name a", p.getName());
		fail("Not yet implemented");
	}

}
