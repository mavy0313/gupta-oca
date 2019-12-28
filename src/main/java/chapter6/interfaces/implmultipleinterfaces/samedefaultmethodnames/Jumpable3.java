package chapter6.interfaces.implmultipleinterfaces.samedefaultmethodnames;

interface Jumpable3 {
    default void relax() {
        System.out.println("No jumping");
    }
}
