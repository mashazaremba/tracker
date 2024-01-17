package ru.oop;

public class Cat {
    private String food;
    private String name;

    public Cat(String food, String name) {
        this.food = food;
        this.name = name;
    }

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }


    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat("kotleta", "Gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat("fish", "Black");
        black.show();
        System.out.println("There are pushok's food.");
        Cat pushok = new Cat("cheese", "Pushok");
        pushok.show();
        System.out.println("There are smocky's food.");
        Cat smoky = new Cat("fish", "Smocky");
        smoky.show();
    }


}
