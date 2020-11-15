package model;

public class AsusVivoBook extends  Notebook{
    private boolean touchId;//karain nayev notebook-i hamar linein,uxaki chgitei inch aranznacnei :)
    private boolean touchScreen;

    public AsusVivoBook(String model, String country, double price,int year) {
        super(model, country, price,year);
    }

    public AsusVivoBook(String model, String country, double price,int year, int ram, int processorSpeed, String processorName, String operatingSystem) {
        super(model, country, price, year,ram, processorSpeed, processorName, operatingSystem);
    }

    public boolean isTouchId() {
        return touchId;
    }

    public void setTouchId(boolean touchId) {
        this.touchId = touchId;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return "touchId=" + touchId +
                ", touchScreen=" + touchScreen ;
    }
}
