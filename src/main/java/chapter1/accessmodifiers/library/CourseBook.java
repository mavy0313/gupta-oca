package chapter1.accessmodifiers.library;

public class CourseBook extends Book {
    public CourseBook() {
        author = "ABC";
        modifyTemplate();

        int c = issueCount;
        issueHistory();
    }
}
