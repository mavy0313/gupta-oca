package chapter6.interfaces.staticmethods;

class Manager implements Interviewer {
    @Override
    public void conductInterview() {
        System.out.println("Mgr - conductInterview");
    }
}
