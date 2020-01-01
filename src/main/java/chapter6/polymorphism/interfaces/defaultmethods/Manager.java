package chapter6.polymorphism.interfaces.defaultmethods;

class Manager implements Interviewer {

    @Override
    public String submitInterviewStatus() {
        System.out.println("Manager:Accept");
        return null;
    }
}
