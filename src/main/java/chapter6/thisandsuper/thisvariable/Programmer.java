package chapter6.thisandsuper.thisvariable;

class Programmer extends Employee {
    void accessEmployeeVariables() {
        name = "Programmer";
        this.name = "Programmer via this";
    }
}
