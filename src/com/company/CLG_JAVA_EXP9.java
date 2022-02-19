package com.company;
class MyBook{
    public String bookName;

   public void setBookName(){
       this.bookName = bookName;
   }
   public String getBookName(){
       return bookName;
   }
    public void display(){
        System.out.println("The name of the book is " + bookName);
    }
}
class RefrenceBook extends MyBook{
    @Override
    public void display(){
        System.out.println("The name of the Refrence Book is "  +bookName );
    }
}
class MagazineBook extends MyBook{
    @Override
    public void display(){
        System.out.println("The name of the Magazine Book is "  +bookName );
    }
}

public class CLG_JAVA_EXP9 {
    public static void main(String[] args) {
        RefrenceBook rb =new RefrenceBook();
        rb.bookName = "Indian History";
        rb.display();
        MagazineBook mb = new MagazineBook();
        mb.bookName = "Demon Slayer";
        mb.display();
    }
}