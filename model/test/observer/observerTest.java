package observer;

import static org.junit.Assert.*;

import org.junit.Test;

import observer2.ConObserver;
import observer2.Subject;

public class observerTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testObserver(){
		WeatherData wd = new WeatherData();
		CurrentConditionDisplay cd = new CurrentConditionDisplay(wd);
		wd.setMeasureChange(80, 22, 32);
		cd.display();
	}
	
	//通知某一个观察者
	@Test
	public void testObserver2(){
//		ConSubject subject = new ConSubject();
		Subject subject = new Subject();
		ConObserver o = new ConObserver();
		subject.setObserver(o);
		subject.nodify("2222");
	}
	
	@Test
	//通知所有注册的观察者
	public void testNodifyAll(){
		Subject subject = new Subject();
		ConObserver o = new ConObserver();
		ConObserver o1 = new ConObserver();
		subject.register(o);
		subject.register(o1);
		subject.setStr("1111111");
		subject.nodifyAll();
	}
}
