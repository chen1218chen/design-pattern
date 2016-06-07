package Adapter;

//被适配者是一个已存在的接口或抽象类，这个接口或抽象类需要适配
public class Adaptee {
	public void func2(){
		System.out.println("adaptee2");
	}
	public void func1(){
		System.out.println("adaptee1");
	}
}
