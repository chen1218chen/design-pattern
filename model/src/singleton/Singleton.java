package singleton;

//饿汉模式
public class Singleton {
	private final static Singleton single = new Singleton();
	private Singleton(){}
	
	public static Singleton getSingle(){
		return single;
	}
	/*public void print(){
		System.out.println("获得对象的实例");
	}
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingle();
		singleton.print();
	}*/
}

