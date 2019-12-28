package chapter6.interfaces.implmultipleinterfaces.samedefaultmethodnames;

interface Jumpable {
    default void relax() {
        System.out.println("No jumping");
    }
}
