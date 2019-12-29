package chapter6.interfaces.extending.sameabstractmethodnames;

class Employee implements MyInterface {
    String name;
    @Override
    public String getName() {
        return name;
    }
}
