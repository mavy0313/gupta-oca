package chapter6.interfaces;

public class Manager extends Employee implements Interviewer, Trainable {
    int teamSize;
    void reportProjectStatus() {}

    @Override
    public void conductInterview() {
        System.out.println("Mgr - conductInterview");
    }

    @Override
    public void attendTraining() {
        System.out.println("Mgr - attendTraining");
    }
}
