package chapter6.thisandsuper.supervariable.accessconstructorofbaseclass;

class Programmer extends Employee {
    String progLanguage;

    Programmer(String name, String address, String progLanguage) {
        super(name, address);
        this.progLanguage = progLanguage;
    }
}
