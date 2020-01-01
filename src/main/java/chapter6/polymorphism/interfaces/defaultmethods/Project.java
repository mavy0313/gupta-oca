package chapter6.polymorphism.interfaces.defaultmethods;

class Project {
    public static void main(String args[]) {
        Interviewer interviewer = new Manager();
        interviewer.submitInterviewStatus();
        Manager mgr = new Manager();
        mgr.submitInterviewStatus();
    }
}
