package ru.cast;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Plane plane = new Plane();
        Train train = new Train();
        Vehicle[] vehicles = {bus, plane, train};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
