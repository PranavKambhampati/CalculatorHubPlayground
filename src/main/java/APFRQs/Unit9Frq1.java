package APFRQs;

// Total 4/5: see comments for scoring below.

import java.util.ArrayList;

class Book {
    public String title;
    public String author;

    public Book(String t, String a)
    {
        title = t;
        author = a;
    }

    public void printBookInfo()
    {
        System.out.print(title + ", written by " + author);
    }
}

class PictureBook extends Book{

    private String illustrator;

    public PictureBook(String t, String a, String i) {
        super(t, a);
        illustrator = i;
    }

    // 1/1. This is a correct method for what question a was asking for.

    public void printBookInfo(){
        System.out.println(title + ", written by " + author + " and illustrated by " + illustrator);
    }
    // 1/2. This has the correct print statment, however, there needs to be a call to super.printBookInfo()
}

class BookListing{

    Book obj;
    Double price;


    public BookListing(Book b, double d) {
        this.obj = b;
        this.price = d;

        b.printBookInfo();
    }

    public void printDescription(){
        System.out.println(obj + ", " + price);
    }

    // 1/1, correctly answers the prompt asked in question c.

}


public class Unit9Frq1 {

    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("Frankenstein","Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz","L. Frank Baum","W.W.Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);

        // 1/1. Correctly initializes the arrayList and then adds the two books to the arrayList correctly.

        BookListing listing1 = new BookListing(book1,10.99);
        listing1.printDescription();

        BookListing listing2 = new BookListing(book2,12.99);
        listing2.printDescription();

    }

}

