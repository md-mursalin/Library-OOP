package org.example;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book( "", "Kishimoto", true,2004);
        b1.add(b1);
        System.out.println(b1.searchByTitle("Naruto"));



    }
}
