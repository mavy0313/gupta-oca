package chapter3;

class IslandOfIsolation {
    public static void main(String args[]) {
        Exam2 php = new Exam2("PHP");
        Exam2 java = new Exam2("Java");
        php.setExam(java);
        java.setExam(php);
        php = null;
        java = null;
    }
}
