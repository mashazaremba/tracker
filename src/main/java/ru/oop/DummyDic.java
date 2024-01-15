package ru.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String result = "Неизвестное слово " + eng;
        return result;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        System.out.println(dummyDic.engToRus("Dog"));
    }
}
