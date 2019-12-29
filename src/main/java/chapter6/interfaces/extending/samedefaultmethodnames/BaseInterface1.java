package chapter6.interfaces.extending.samedefaultmethodnames;

interface BaseInterface1 {
    default void getName() {
        System.out.println("Base1");
    }
}
