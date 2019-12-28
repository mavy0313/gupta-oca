package chapter6.interfaces.implmultipleinterfaces.samedefaultmethodnames;//package chapter6.interfaces.implmultipleinterfaces.samedefaultmethodnames;

class Animal2 implements Jumpable, Moveable {
    @Override
    public void relax() {
        System.out.println("Watch movie");
    }
}
