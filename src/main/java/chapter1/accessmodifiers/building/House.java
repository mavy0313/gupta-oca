package chapter1.accessmodifiers.building;

import chapter1.accessmodifiers.library.Book;

public class House {
    public House() {
        Book book = new Book();
        String value = book.isbn;
        book.printBook();

//        no access to protected members
//        book.author = "ABC";
//        book.modifyTemplate();

//        no access to private-package members outside package
//        int c = book.issueCount;
//        book.issueHistory();
    }
}
