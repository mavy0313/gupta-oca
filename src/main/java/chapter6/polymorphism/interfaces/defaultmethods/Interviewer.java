package chapter6.polymorphism.interfaces.defaultmethods;

interface Interviewer {
    default Object submitInterviewStatus() {
        System.out.println("Interviewer:Accept");
        return null;
    }
}
