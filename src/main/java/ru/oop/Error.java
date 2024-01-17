package ru.oop;

public class Error {
    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println("active: " + this.active);
        System.out.println("status: " + this.status);
        System.out.println("message: " + this.message);
    }

    public static void main(String[] args) {
        System.out.println("This is error1");
        Error error1 = new Error();
        error1.showInfo();
        System.out.println();

        System.out.println("This is error2");
        Error error2 = new Error(true, 2, "hello");
        error2.showInfo();
        System.out.println();

        System.out.println("This is error3");
        Error error3 = new Error(false, 3, "error");
        error3.showInfo();
        System.out.println();

        System.out.println("This is error4");
        Error error4 = new Error(true, 5, "goodbye");
        error4.showInfo();
        System.out.println();
    }
}
