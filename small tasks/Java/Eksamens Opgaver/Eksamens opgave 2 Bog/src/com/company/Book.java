package com.company;

public class Book {
    int ISBNNumber;
    String title;
    int yearOfPublication;

    public Book(int ISBNNumber, String title, int yearOfPublication) {
        this.ISBNNumber = ISBNNumber;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getISBNNumber() == book.getISBNNumber();
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "BOOK:" + "ISBNNumber = " + ISBNNumber + ", title = '" + title + '\'' + ", yearOfPublication = " + yearOfPublication;
    }
}
