package observer2;

public class ConObserver implements Observer{

	@Override
	public void display(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}

	@Override
	public void update(String str) {
		// TODO Auto-generated method stub
		display(str);
	}
	

}
