class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayType() {
        System.out.println("General Book");
    }
}

class PrintedBook extends Book {
    public PrintedBook(String title) {
        super(title);
    }

    public void displayType() {
        System.out.println("Printed Book");
    }
}

class EBook extends Book {
    public EBook(String title) {
        super(title);
    }

    public void displayType() {
        System.out.println("E-Book");
    }
}

class AudioBook extends Book {
    public AudioBook(String title) {
        super(title);
    }

    public void displayType() {
        System.out.println("AudioBook");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new PrintedBook("Book01");
        Book b2 = new EBook("Book02");
        Book b3 = new AudioBook("Book03");

        b1.displayType();
        b2.displayType();
        b3.displayType();

    }
}
