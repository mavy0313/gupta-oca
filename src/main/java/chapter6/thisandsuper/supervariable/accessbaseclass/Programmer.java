package chapter6.thisandsuper.supervariable.accessbaseclass;

class Programmer extends Employee {
    String name;

    void setNames() {
        this.name = "Programmer";
        super.name = "Employee";
    }

    void printNames() {
        System.out.println(super.name);
        System.out.println(this.name);
    }

}
