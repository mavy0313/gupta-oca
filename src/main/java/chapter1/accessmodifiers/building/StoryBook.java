package chapter1.accessmodifiers.building;

import chapter1.accessmodifiers.library.Book;

public class StoryBook extends Book {
    public StoryBook() {
        author = "ABC";
        modifyTemplate();

//        no access to protected members via reference variables
//        Book book = new Book();
//        String value = book.author;
//        book.modifyTemplate();
    }
}
