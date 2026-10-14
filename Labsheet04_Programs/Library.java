
public class Library {
    int booksAvailable;
    static String libraryName = "Central Library";

    Library(int booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    void issueBook() {
        int remainingBooks = booksAvailable - 1;

        if (remainingBooks >= 0) {
            booksAvailable = remainingBooks;
            System.out.println("Book issued successfully");
        } else {
            System.out.println("No books available");
        }
    }

    void returnBook() {
        int updatedBooks = booksAvailable + 1;
        booksAvailable = updatedBooks;
        System.out.println("Book returned successfully");
    }

    void display() {
        System.out.println("Library: " + libraryName);
        System.out.println("Books available: " + booksAvailable);
    }

    public static void main(String[] args) {
        Library l = new Library(5);

        l.display();
        l.issueBook();
        l.display();
        l.returnBook();
        l.display();
    }
}
