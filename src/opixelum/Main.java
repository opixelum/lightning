package opixelum;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(false);
        Lamp lamp2 = new Lamp(false);
        Switch sw = new Switch(lamp1, lamp2);

        sw.lampsStatus();

        sw.switchLampOn(lamp1, 100);
        sw.lampsStatus();

        sw.switchLampOn(lamp2, 100);
        sw.lampsStatus();

        sw.switchLampOn(lamp1, 50);
        sw.lampsStatus();
    }
}