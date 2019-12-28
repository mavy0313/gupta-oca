package chapter6.interfaces.implmultipleinterfaces.samedefaultmethodnames;

interface Moveable {
    default void relax() {
        System.out.println("No moving");
    }
}
