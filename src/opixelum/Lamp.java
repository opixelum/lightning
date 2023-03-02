package opixelum;

public class Lamp {
    private boolean isOn;
    private Integer brightness;

    public Lamp(boolean isOn) {
        this.isOn = isOn;
    }

    public Lamp(Integer brightness) {
        this.brightness = brightness;
    }

    public boolean isOn() {
        return isOn;
    }

    public Integer getBrightness() {
        return brightness;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }
}
