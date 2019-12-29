package chapter6.interfaces.modifying.changingdefault;

interface Jumpable {
//    abstract int maxDistance();

    default int maxDistance() {
        return 200;
    }

//    static int maxDistance() {
//        return 200;
//    }
}
