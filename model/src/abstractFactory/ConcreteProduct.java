package abstractFactory;

public class ConcreteProduct extends Product{

	@Override
	public String getName() {
		System.out.println("name a");
		return "name is a";
	}
	
	public void getPrice(){
		System.out.println("price is 10");
	}
}
