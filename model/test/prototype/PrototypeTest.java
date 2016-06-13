package prototype;

import org.junit.Test;

import prototype.ConPrototype;


public class PrototypeTest {

	@Test
	public void test() {
		ConPrototype con = new ConPrototype();
		for(int i=0;i<5;i++){
			ConPrototype conCopy = (ConPrototype) con.clone();
			conCopy.show();
		}
	}

}
