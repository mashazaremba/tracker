package ru.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Clean code", 50);
        Book book1 = new Book("Book1", 100);
        Book book2 = new Book("Book2", 200);
        Book book3 = new Book("Book3", 300);
        Book[] books = {book, book1, book2, book3};
        for (int i = 0; i < books.length; i++) {
           Book b = books[i];
            System.out.println(b.getName() + b.getPages());
        }
        System.out.println("______________");
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b.getName().equals("Clean code")) {
                System.out.println(b.getName() + b.getPages());
            }
        }
        System.out.println("______________");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + b.getPages());
        }
    }
}
