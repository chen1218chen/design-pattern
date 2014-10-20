package observer;
import java.util.ArrayList;

public class WeatherData implements Subject{
	
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList();
	} 
	
	@Override
	public void notice() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>=0)
			observers.remove(i);
	}
	
	public void measureChange(){
		notice();
	}
	
	public void setMeasureChange(float temp,float humidity ,float presssure){
		this.humidity = humidity;
		this.temperature = temp;
		this.pressure = presssure;
		measureChange();
	}
}
