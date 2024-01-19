package ru.oop;

public class Test {

    public int b;

    public static void test(int a) {
        a += 1;
    }

    public static void test1(Test test) {
        test.b += 1;
    }

    public static void main(String[] args) {
        int a = 10;
        test(a);
        System.out.println(a);

        Test test = new Test();
        test.b = 10;
        test1(test);
        System.out.println(test.b);
    }
}
