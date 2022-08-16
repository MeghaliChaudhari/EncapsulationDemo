package main;

import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setTitle("Book");
        obj.setYearOfPublication(2003);
        obj.setIsbn(1234567890123L);
        obj.setAuthorName("ABC");

        System.out.println("Title : " + obj.getTitle());
        System.out.println("Year Of Publication : " + obj.getYearOfPublication());
        System.out.println("Isbn no. : " + obj.getIsbn());
        System.out.println("Author Name : " + obj.getAuthorName());
    }
}
