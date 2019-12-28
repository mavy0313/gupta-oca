package chapter6.interfaces.implmultipleinterfaces.sameabstractmethodnames;

class Animal implements Jumpable, Moveable {
    @Override
    public String currentPosition() {
        return "Home";
    }
}
