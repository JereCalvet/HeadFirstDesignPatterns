package observers;

import subject.Subject;
import subject.WeatherData;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void update() {
        WeatherData data = (WeatherData) weatherData;
        this.temperature = data.getTemperature();
        this.humidity = data.getHumidity();
        display();
    }
}
