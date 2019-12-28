package chapter6.interfaces.implmultipleinterfaces.samedefaultmethodnames;

interface Moveable3 {
    default String relax() {
        System.out.println("No moving");
        return null;
    }
}
