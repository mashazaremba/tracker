package ru.oop;

public class Test {

    public int b;

    public static void test(int a) {
        a += 1;
    }

    public void test1(int a) {

    }

    public static void main(String[] args) {
Test.test(10);
Test test = new Test();
test.test1(20);
    }
}
