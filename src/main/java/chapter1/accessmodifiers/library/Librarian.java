package chapter1.accessmodifiers.library;

public class Librarian {
    public Librarian() {
        Book book = new Book();
        book.author = "ABC";
        book.modifyTemplate();
    }
}
