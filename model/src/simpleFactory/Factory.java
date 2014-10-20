package simpleFactory;

public class Factory {
	public static Product getProduct(String type) throws InstantiationException, IllegalAccessException{
		if(type.equalsIgnoreCase("productA"))
			return ProductA.class.newInstance();
		else if(type.equalsIgnoreCase("productB"))
			return ProductB.class.newInstance();
		else{
			System.out.println("没有找到");
			return null;
		}
	}
}
