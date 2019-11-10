package chapter3;

class Exam2 {
    private String name;
    private Exam2 other;
    public Exam2(String name) {
        this.name = name;
    }
    public void setExam(Exam2 exam) {
        other = exam;
    }
}
