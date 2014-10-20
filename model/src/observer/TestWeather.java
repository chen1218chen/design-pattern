package observer;

public class TestWeather {
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionDisplay cd = new CurrentConditionDisplay(wd);
		wd.setMeasureChange(80, 22, 32);
	}
}
