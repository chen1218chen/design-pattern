package decorate;

public class Mocha extends Condiment{
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage= beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.2+beverage.cost();
	}
	
}
