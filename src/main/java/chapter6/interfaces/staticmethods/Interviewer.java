package chapter6.interfaces.staticmethods;

import java.time.LocalDateTime;

interface Interviewer {
    abstract void conductInterview();
    default void submitInterviewStatus() {
        System.out.println("Accept");
    }
    static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
        System.out.println("Interview scheduled on:" + dateTime);
        System.out.println("Book conference room for: "+duration + " hrs");
    }
}
