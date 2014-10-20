package abstractFactory2;

public class Factory implements IFactory{

	@Override
	public IProduct2 createProduct2() {
		// TODO Auto-generated method stub
		return new Product2();
	}

	@Override
	public IProduct1 cteateProduct1() {
		// TODO Auto-generated method stub
		return new Product1();
	}
}
