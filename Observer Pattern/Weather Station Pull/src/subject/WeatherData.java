package subject;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    public void registerObserver(Observer obs) {
        observerList.add(obs);
    }

    public void removeObserver(Observer obs) {
        int index = observerList.indexOf(obs);
        if (index >= 0) {
            observerList.remove(index);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
