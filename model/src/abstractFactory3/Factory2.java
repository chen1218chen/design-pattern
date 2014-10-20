package abstractFactory3;

public class Factory2 implements IFactory{

	@Override
	public IProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

	@Override
	public IProductA cteateProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}
	
}
