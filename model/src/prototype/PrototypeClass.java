package prototype;

import java.util.ArrayList;

public class PrototypeClass implements Cloneable {

	@Override
	public PrototypeClass clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PrototypeClass prototype = (PrototypeClass) super.clone();
		return prototype;

	}

}

class Prototype implements Cloneable {
	private ArrayList list = new ArrayList();

	public Prototype clone() {
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
			prototype.list = (ArrayList) this.list.clone();// 实现深拷贝
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototype;
	}
}

class ConPrototype extends Prototype {
	public void show() {
		System.out.println("原型模式实现");
	}
}