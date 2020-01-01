package chapter6.casting;

class HRExecutive extends Employee implements Interviewer {
    String[] specialization;

    @Override
    public void conductInterview() {
        System.out.println("HRExecutive - conducting interview");
    }
}
