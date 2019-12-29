package chapter6.interfaces.modifying.changingabstract;

interface Jumpable {
//    abstract int maxDistance();

//    default int maxDistance() {
//        return 100;
//    }

    static int maxDistance() {
        return 200;
    }
}
