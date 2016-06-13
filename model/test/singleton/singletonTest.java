package singleton;

import org.junit.Test;

public class singletonTest {
	
	@Test
	public void testSingleton(){
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		Singleton2 singleton2 = Singleton2.getInstance();
		Singleton2 singleton3 = Singleton2.getInstance();
		singleton.setName("chen");
		singleton1.setName("cc");
		singleton.print();
		singleton1.print();//结果相同，可看出是一个实例
		if(singleton==singleton1)
			System.out.println("the same instance");
	}

}
