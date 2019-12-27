package chapter6.interfaces.staticmethods;

import java.time.LocalDateTime;

class Project {
    public static void main(String[] args) {
        Interviewer inv = new Manager();
//        inv.bookConferenceRoom(LocalDateTime.now(), 2);  won't compile
        Manager mgr = new Manager();
//        mgr.bookConferenceRoom(LocalDateTime.now(), 2);  won't compile
        Interviewer.bookConferenceRoom(LocalDateTime.now(), 2);

//        static method from class can be called by reference variable and class name
        Employee emp = new Programmer();
        emp.defaultPlan();
        Programmer pgr = new Programmer();
        pgr.defaultPlan();
        Employee.defaultPlan();
        Programmer.defaultPlan();
    }
}
