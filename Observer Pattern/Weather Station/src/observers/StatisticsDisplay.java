package observers;

import subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final Subject weatherData;
    private float maxTemp;
    private float minTemp;
    private float tempSum;
    private int numReadings;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        this.maxTemp = 0.0f;
        this.minTemp = 200;
        this.tempSum = 0.0f;
        this.numReadings = 0;
    }

    public void update(float temp, float humidity, float pressure) {
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        if (temp < minTemp) {
            minTemp = temp;
        }
        tempSum += temp;
        numReadings++;
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature: " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
