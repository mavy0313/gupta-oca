package chapter6.interfaces.extending.samedefaultmethodnames;

interface BaseInterface2 {
    default void getName() {
        System.out.println("Base2");
    }
}
