package chapter3;

class ObjectLife2 {
    public static void main(String args[]) {
        Exam myExam = new Exam("PHP");
        myExam = null;
        myExam = new Exam("SQL");
        myExam = new Exam("Java");
        Exam yourExam = new Exam("PMP");
        yourExam = myExam;
    }
}
