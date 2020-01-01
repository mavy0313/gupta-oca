package chapter6.polymorphism.classes;

class Programmer extends Employee {
    @Override
    public void startProjectWork() {
        defineClasses();
        unitTestCode();
    }

    private void defineClasses() {
        System.out.println("define classes");
    }

    private void unitTestCode() {
        System.out.println("unit test code");
    }
}
