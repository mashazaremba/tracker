package ru.pojo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.ride();
        Transport transport = car;
        transport.ride();
        Object object = transport;
        Object object1 = new Student();
        Transport transport1 = (Transport) object;
        transport1.ride();
        Transport transport2 = (Transport) object1;
    }
}
