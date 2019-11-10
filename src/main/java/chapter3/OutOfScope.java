package chapter3;

public class OutOfScope {
    public void myMethod() {
        int result = 88;
        if (result > 78) {
            Exam myExam1 = new Exam(""); //myExam1 is not accessible outside of if block
            myExam1.setName("Android");
        }
        else {
            Exam myExam2 = new Exam(""); //myExam2 is not accessible outside of else block
            myExam2.setName("MySQL");
        }
    }
}
