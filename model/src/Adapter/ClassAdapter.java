package Adapter;
/**
 * 
 * @author cc
 * @description 类适配器
 * 该类实现了目标接口并包含有被适配者的引用
 */
public class ClassAdapter extends Adaptee implements Target {
	
	@Override
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("target1");
	}

	@Override
	public void func2() {
		// TODO Auto-generated method stub
		this.func2();
	}

}


//对象适配器
 class ObjectAdapter implements Target{
	 Adaptee adaptee = new Adaptee();
	 

	@Override
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("object");
	}

	@Override
	public void func2() {
		// TODO Auto-generated method stub
		adaptee.func2();
	}
	 
 }