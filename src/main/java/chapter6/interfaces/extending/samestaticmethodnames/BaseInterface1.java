package chapter6.interfaces.extending.samestaticmethodnames;

interface BaseInterface1 {
    static void status() {
        System.out.println("Base1");
    }
    static void status2() {
        System.out.println("Base1");
    }
}
