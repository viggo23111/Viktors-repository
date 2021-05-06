package com.company;

public class Main {


    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(1111,"TestBook1",2011);
        Book book2 = new Book(2222,"TestBook2",2012);
        Book book3 = new Book(3333,"TestBook3",2013);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
       // library.addBookToLibrary(book3);
        //System.out.println(library.isBookInLibrary(book3));
        //System.out.println(library.getBooks().get(1).equals(book1));
        for (Book b: library.getBooks()) {
            System.out.println(b.equals(book1));
        }
        // write your code here
        /*Bog

Skriv en klasse kaldet Bog, der indeholder ISBN-nummer, titel og udgivelsesår.

Skriv flg. metoder:

· Konstruktør metode

· Get og set metoder

· toString metode

· Skriv en equals metode baseret på ISBN

Skriv en klasse kaldet Bibliotek, der indeholder en liste af Bog objekter.

· Skriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter, og returnerer true, hvis listen indeholder et Bog objekt med samme ISBN.*/
    }
}
