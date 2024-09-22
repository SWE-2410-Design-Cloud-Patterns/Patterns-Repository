package weatherStation;

public class Main {
    public static void main(String[] args) {
        // Create the subject (weather station)
        WeatherStation weatherStation = new WeatherStation();
        System.out.println("Weather Station created.");

        // Create concrete observers
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        LaptopDisplay laptopDisplay = new LaptopDisplay();
        TabletDisplay tabletDisplay = new TabletDisplay();
        System.out.println("Observers (Phone, Laptop, Tablet) created.");

        // Register observers to the weather station
        System.out.println("Registering observers to the Weather Station...");
        weatherStation.register(phoneDisplay);
        weatherStation.register(laptopDisplay);
        weatherStation.register(tabletDisplay);
        System.out.println("Observers registered.\n");

        // Update temperature, observers will get notified
        System.out.println("Updating temperature to 25.5°C...");
        weatherStation.setTemperature(25.5f);  // All displays get notified
        System.out.println();

        System.out.println("Updating temperature to 30.0°C...");
        weatherStation.setTemperature(30.0f);  // All displays get notified again
        System.out.println();

        // Unregister an observer
        System.out.println("Unregistering Laptop Display from Weather Station...");
        weatherStation.unregister(laptopDisplay);
        System.out.println("Laptop Display unregistered.\n");

        // Update temperature, only phone and tablet will get notified
        System.out.println("Updating temperature to 22.5°C...");
        weatherStation.setTemperature(22.5f);  // Only phone and tablet will be notified
    }
}

