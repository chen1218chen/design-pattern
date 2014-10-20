package prototype;

public class PrototypeClass implements Cloneable{

	@Override
	public PrototypeClass clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PrototypeClass prototype =(PrototypeClass) super.clone();
		return prototype; 
		 
	}
	
}
