package ru.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int c) {
        return c - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int d) {
       return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = Calculator.sum(10);
        System.out.println(result);
        System.out.println(calculator.multiply(3));
        System.out.println(calculator.divide(4));
        System.out.println(minus(5));
        System.out.println(calculator.sumAllOperation(7));
    }

}
