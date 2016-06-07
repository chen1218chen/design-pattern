package Adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class adapter {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testClassAdapter(){
		Target target = new ClassAdapter();
		target.func2();
	}
	@Test
	public void testObjectAdapter(){
		Target target = new ObjectAdapter();
		target.func1();
	}

}
