package opixelum;

public class Lamp {
    private static final Integer MIN_BRIGHTNESS = 0;
    private static final Integer MAX_BRIGHTNESS = 100;

    private Boolean isOn;
    private Integer brightness;

    public Lamp(Boolean isOn) {
        this.isOn = isOn;

        if (isOn) {
            this.brightness = MAX_BRIGHTNESS;
        } else {
            this.brightness = MIN_BRIGHTNESS;
        }
    }

    public Lamp(Integer brightness) {
        this.brightness = brightness;

        if (brightness > MIN_BRIGHTNESS) {
            this.isOn = true;
        } else {
            this.isOn = false;
        }
    }

    public Boolean isOn() {
        return isOn;
    }

    public Integer getBrightness() {
        return brightness;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }
}
