package model;

public class IPhone extends SmartPhone {

    private boolean hasFaceId;
    private boolean hasTouchId;
    private boolean hasBatteryCharger;


    public IPhone(String model, String country, double price, int year) {
        super(model, country, price, year);
    }

    public IPhone(String model, String country, double price, double screenSize, int ram, boolean isSingleSim, boolean isNFC, int year) {
        super(model, country, price, year, screenSize, ram, isSingleSim, isNFC);
    }

    public IPhone(String model, String country, double price, int year, double screenSize, int ram, boolean isSingleSim, boolean isNFC, boolean hasFaceId, boolean hasTouchId, boolean hasBatteryCharger) {
        super(model, country, price, year, screenSize, ram, isSingleSim, isNFC);
        setHasFaceId(hasFaceId);
        setTouchId(hasTouchId);
        setHasBatteryCharger(hasBatteryCharger);
    }

    public boolean hasFaceId() {
        return hasFaceId;
    }

    public void setHasFaceId(boolean hasFaceId) {
        this.hasFaceId = hasFaceId;
    }

    public boolean hasTouchId() {
        return hasTouchId;
    }

    public void setTouchId(boolean touchId) {
        hasTouchId = touchId;
    }

    public boolean hasBatteryCharger() {
        return hasBatteryCharger;
    }

    public void setHasBatteryCharger(boolean hasBatteryCharger) {
        this.hasBatteryCharger = hasBatteryCharger;
    }

    @Override
    public void discount() {
        if (getYear() < 2017 && !hasFaceId())
            System.out.println("New price is :" + getPrice() * 0.6);
        else
            System.out.println("No discount");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("FaceId - " + hasFaceId());
        System.out.println("TouchId - " + hasTouchId());
        System.out.println("BatteryCharger - " + hasBatteryCharger());
    }
}
