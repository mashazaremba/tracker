package ru.pojo;

public class Library {

    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + b.getPages());
        }
    }

    public static void printByName(Book[] books, String bookName) {
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b.getName().equals(bookName)) {
                System.out.println(b.getName() + b.getPages());
            }
        }
    }

    public static void swap(Book[] books, int source, int dest) {
        Book temp = books[source];
        books[source] = books[dest];
        books[dest] = temp;
    }

    public static void main(String[] args) {
        Book book = new Book("Clean code", 50);
        Book book1 = new Book("Book1", 100);
        Book book2 = new Book("Book2", 200);
        Book book3 = new Book("Book3", 300);
        Book[] books = {book, book1, book2, book3};
        printBooks(books);
        System.out.println("______________");
        String bookName = "Clean code";
        printByName(books, bookName);
        System.out.println("______________");
        int source = 0;
        int dest = 3;
        swap(books, source, dest);
        printBooks(books);
    }
}