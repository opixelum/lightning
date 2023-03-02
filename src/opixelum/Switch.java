package opixelum;

public class Switch {
    private Lamp lamp1;
    private Lamp lamp2;

    public Switch(Lamp lamp1, Lamp lamp2) {
        this.lamp1 = lamp1;
        this.lamp2 = lamp2;
    }

    public Lamp getLamp1() {
        return lamp1;
    }

    public Lamp getLamp2() {
        return lamp2;
    }

    public void setLamp1(Lamp lamp1) {
        this.lamp1 = lamp1;
    }

    public void setLamp2(Lamp lamp2) {
        this.lamp2 = lamp2;
    }
}
