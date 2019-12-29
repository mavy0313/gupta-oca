package chapter6.interfaces.modifying.changingstatic;

interface Jumpable {
    static int maxDistance() {
        return 100;
    }

//    default int maxDistance() {
//        return 100;
//    }

//    abstract int maxDistance();
}
