package singleton;

//饱汉模式
public class Singleton2 {
	private static Singleton2 single = null;
	private Singleton2(){}
	
	public static synchronized Singleton2 getSingle(){
		if(single==null)
			single = new Singleton2();
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

