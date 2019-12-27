package chapter6.interfaces;

public class Programmer extends Employee implements Trainable {
    String[] programmingLanguages;
    void writeCode() {}

    @Override
    public void attendTraining() {
        System.out.println("Prog - attendTraining");
    }
}
