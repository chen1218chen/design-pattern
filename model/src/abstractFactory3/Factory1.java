package abstractFactory3;

public class Factory1 implements IFactory{

	@Override
	public IProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

	@Override
	public IProductA cteateProductA() {
		// TODO Auto-generated method stub
		return new ProductA1() ;
	}


}
