/*
Problem Statement :
 Create a library management system which is capable of issuing books to the students.
 Book should have info like:
 1. Book name
 2. Book Author
 3. Issued to
 4. Issued on
 User should be able to add books, return issued books, issue books
 Assume that all the users are registered with their names in the central database
  */
package com.company;
import java.util.ArrayList;

class Book{
    public String name , author ;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary {
    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book adbook){
        System.out.println("The book has been added to the library");
        this.books.add(adbook);
    }
    public void issueBook(Book isbook , String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(isbook);
    }
    public void returnBook(Book rebook){
        System.out.println("Your book has been  returned to the library");
        this.books.add(rebook);
    }
}
public class CWP_Ex7_LibraryManagementDatabase {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 =new Book("Java Dsa Book ", "Google");
        bk.add(b1);
        Book b2 = new Book("Android Development Book ", "Amazon");
        bk.add(b2);
        Book b3 = new Book("Cpp Dsa Book ", "FlipKart");
        bk.add(b3);
//        bk.add(new Book("Core Java Book ", "Byjus"));
//        bk.add(new Book("Advance Java Book ", "Apple"));
//        bk.add(new Book("Python Dsa Book ", "Micromax"));

        MyLibrary ml = new MyLibrary(bk);
        ml.addBook(new Book("Procedural C " , "Microsoft"));
        System.out.println(ml.books);
        ml.issueBook(b3 ,"Pratham");
        System.out.println(ml.books);
    }
}
