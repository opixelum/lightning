package opixelum;

public class Lamp {
    private boolean isOn;
    private Integer brightness;

    public Lamp(boolean isOn) {
        this.isOn = isOn;

        if (isOn) {
            this.brightness = 100;
        } else {
            this.brightness = 0;
        }
    }

    public Lamp(Integer brightness) {
        this.brightness = brightness;

        if (brightness > 0) {
            this.isOn = true;
        } else {
            this.isOn = false;
        }
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
