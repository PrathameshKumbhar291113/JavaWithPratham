package com.company;
class Library{
    String[] books;
    int no_of_books;
    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + "  : book has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are");
        for (String book :this.books) {
            if(book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
            for(int i=0;i<this.books.length;i++){
                if(this.books[i].equals(book)){
                    System.out.println("The book has been issued");
                    this.books[i]=null;
                    return;
                }
            }
            System.out.println("This book does not exist");
    }

    void returnBook(String book){
      addBook(book);
    }
}
public class CWP_EX4_OnlineLibrary{
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Life of Pie");
        centralLibrary.addBook("Java Book");
        centralLibrary.addBook("Dsa Book");
        System.out.println();

        centralLibrary.showAvailableBooks();
        System.out.println();

        centralLibrary.issueBook("Dsa Book");
        System.out.println();
        centralLibrary.showAvailableBooks();
        System.out.println();

        centralLibrary.returnBook("Dsa Book");
        System.out.println();
        centralLibrary.showAvailableBooks();
    }
}
