package observers;

import subject.Subject;
import subject.WeatherData;

public class ForecastDisplay implements DisplayElement, Observer {
    private final Subject weatherData;
    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        this.currentPressure = 29.92f;
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    public void update() {
        WeatherData data = (WeatherData) weatherData;
        lastPressure = currentPressure;
        currentPressure = data.getPressure();
        display();
    }
}
