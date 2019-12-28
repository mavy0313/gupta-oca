package chapter6.interfaces.implementing;

import java.time.LocalDateTime;

class ManagerStatic implements InterviewerStatic {
    static String bookConferenceRoom(LocalDateTime dateTime, int dur) {
        System.out.println("Manager-bookConferenceRoom");
        return null;
    }
}
