package chapter6.polymorphism.classes;

class Manager extends Employee {
    @Override
    public void startProjectWork() {
        meetingWithCustomer();
        defineProjectSchedule();
        assignRespToTeam();
    }

    private void meetingWithCustomer() {
        System.out.println("meet customer");
    }

    private void defineProjectSchedule() {
        System.out.println("project schedule");
    }

    private void assignRespToTeam() {
        System.out.println("team work starts");
    }
}
