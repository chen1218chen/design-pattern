package abstractFactory;

public class ConcreteFactory extends Factory{

	public <T extends Product> T createProduct(Class<T> c) {
		// TODO Auto-generated method stub
		Product p=null;
		try {
			p=(Product)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) p;
	}

}
