package chapter6.thisandsuper;

class Programmer extends Employee {
    String name;
    static void setNames() {
//        this.name = "Programmer"; won't compile - cannot reference from a static context
//        super.name = "Employee"; won't compile - cannot reference from a static context
    }
}
