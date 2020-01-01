package chapter6.polymorphism.interfaces.abstractmethods;

class PolymorphismWithInterfaces {
    public static void main(String[] args) {
        MobileAppExpert expert1 = new Programmer();
        MobileAppExpert expert2 = new Manager();
        expert1.deliverMobileApp();
        expert2.deliverMobileApp();

//        Employee expert3 = new Programmer();
//        Employee expert4 = new Manager();
//        expert3.deliverMobileApp(); won't compile
//        expert4.deliverMobileApp();
    }
}
