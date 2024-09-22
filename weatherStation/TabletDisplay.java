package weatherStation;


// Concrete Observer - Tablet Display
class TabletDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Tablet Display: Temperature updated to " + temperature + "°C");
    }
}
