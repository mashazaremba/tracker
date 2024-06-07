package ru.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Автобус едет");
    }

    @Override
    public void getPassengers(int passengersCount) {
        System.out.println("Количество пассажиров: " + passengersCount);
    }

    @Override
    public double refuel(double fuel) {
        double price = 2.5;
        return price * fuel;
    }
}
