package simpleFactory;

import org.junit.Test;


public class SimpleTest {
	@Test
	public void testSimple() throws InstantiationException, IllegalAccessException{
		Product a = Factory.getProduct("producta");
		Product b = Factory.getProduct("productb");
		a.getName();
		b.getName();
	}
}
