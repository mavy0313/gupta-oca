package chapter6.polymorphism.interfaces.abstractmethods;

class Programmer extends Employee implements MobileAppExpert {
    @Override
    public void deliverMobileApp() {
        System.out.println("testing complete on real device");
    }
}
