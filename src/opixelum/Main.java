package opixelum;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(true);
        Lamp lamp2 = new Lamp(100);
        Switch sw = new Switch(lamp1, lamp2);

        System.out.println("Lamp 1 is on: " + sw.getLamp1().isOn());
        System.out.println("Lamp 2 brightness: " + sw.getLamp2().getBrightness());
    }
}