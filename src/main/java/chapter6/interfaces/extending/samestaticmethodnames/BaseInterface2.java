package chapter6.interfaces.extending.samestaticmethodnames;

interface BaseInterface2 {
    static void status() {
        System.out.println("Base2");
    }
    static String status2() {
        System.out.println("Base2");
        return null;
    }
}
