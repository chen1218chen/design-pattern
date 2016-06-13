package singleton;

//饿汉模式,类一旦加载，就把单例初始化完成，保证getInstance的时候，单例是已经存在的了，
public class Singleton {
	private final static Singleton single = new Singleton();
	private String name ;

	private Singleton(){}
	
	public static Singleton getInstance(){
		return single;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void print(){
		System.out.println("the name is "+name);
	}
}

//饱汉模式,而懒汉比较懒，只有当调用getInstance的时候，才回去初始化这个单例。
class Singleton2 {
	private static Singleton2 singleton= null;
	private String name ;
	private Singleton2(){}
	
	public static  synchronized Singleton2 getInstance(){
		if(singleton ==null){
			singleton = new Singleton2();
		}
		return singleton;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void print(){
		System.out.println("the name is "+name);
	}
}