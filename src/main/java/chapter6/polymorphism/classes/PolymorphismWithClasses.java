package chapter6.polymorphism.classes;

public class PolymorphismWithClasses {
    public static void main(String[] args) {
        Employee emp1 = new Programmer();
        Employee emp2 = new Manager();
        emp1.reachOffice();
        emp2.reachOffice();
        emp1.startProjectWork();
        emp2.startProjectWork();
    }
}
