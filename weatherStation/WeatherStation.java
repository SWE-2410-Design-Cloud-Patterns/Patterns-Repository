package weatherStation;

import java.util.ArrayList;
import java.util.List;

// Subject that observers are watching
class WeatherStation {
    private final List<Observer> observers = new ArrayList<>();
    private float temperature;

    // Method to register an observer
    public void register(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    // Method to notify all registered observers
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    // Method to update the temperature (subject state change)
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("Weather Station: Temperature updated to " + temperature + "°C");
        notifyObservers();  // Notify all observers
    }
}
