package chapter6.polymorphism.interfaces.abstractmethods;

class Manager extends Employee implements MobileAppExpert {
    @Override
    public void deliverMobileApp() {
        System.out.println("QA complete");
        System.out.println("code delivered with release notes");
    }
}
