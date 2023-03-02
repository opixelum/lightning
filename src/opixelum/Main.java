package opixelum;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(false);
        Lamp lamp2 = new Lamp(0);
        Switch sw = new Switch(lamp1, lamp2);

        System.out.println("Lamp 1:\n\tOn: " + sw.getLamp1().isOn() + "\n\tBrightness: " + sw.getLamp1().getBrightness());
        System.out.println("Lamp 2:\n\tOn: " + sw.getLamp2().isOn() + "\n\tBrightness: " + sw.getLamp2().getBrightness());
    }
}