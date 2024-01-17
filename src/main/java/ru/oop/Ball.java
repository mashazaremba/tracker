package ru.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            String isEat = "колобок съеден";
            System.out.println(isEat);
        } else {
            String isRun = "колобок сбежал";
            System.out.println(isRun);
        }
    }
}
