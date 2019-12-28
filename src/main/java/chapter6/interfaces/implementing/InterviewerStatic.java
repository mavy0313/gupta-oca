package chapter6.interfaces.implementing;

import java.time.LocalDateTime;

interface InterviewerStatic {
    static void bookConferenceRoom(LocalDateTime dateTime, int dur) {
        System.out.println("Interviewer-bookConferenceRoom");
    }
}
