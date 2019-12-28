package chapter6.interfaces.implementing;

interface InterviewerDefault {
    default Object submitInterviewStatus() {
        System.out.println("Accept");
        return null;
    }
}
