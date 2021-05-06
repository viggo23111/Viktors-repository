package com.company;

import java.util.ArrayList;

public class Library {
    public static ArrayList<Book> books = new ArrayList<>();


    public static boolean isBookInLibrary(Book book){
        if(books.contains(book)){
            return true;
        }
        return false;
    }

    public static void addBookToLibrary(Book book){
        if(books.contains(book)){
            System.out.println("Book is already in the library");
        }else{
           books.add(book);
           System.out.println(book + "Have been added");
        }
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }
}
