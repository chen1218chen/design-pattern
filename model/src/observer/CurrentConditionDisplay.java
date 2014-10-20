package observer;

public class CurrentConditionDisplay implements Observer , DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weather;
	
	public CurrentConditionDisplay(Subject weather){
		this.weather = weather;
		weather.register(this);
		
	}
	@Override
	public void update(float temp, float humidity, float presssure) {
		// TODO Auto-generated method stub
		this.humidity = humidity;
		this.temperature = temp;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions:"+temperature+" F degrees "+humidity+" % humidity");
	}
	
}
