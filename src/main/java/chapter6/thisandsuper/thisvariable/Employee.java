package chapter6.thisandsuper.thisvariable;

class Employee {
    String name;
    String address;

    Employee() {
        name = "NoName";
        address = "NoAddress";
    }

    Employee(String name, String address) {
        this();
        if (name != null) this.name = name;
        if (address != null) this.address = address;
    }

//    Employee(String name) {
//        this.name = name;
//    }
//    Employee(String name, String address) {
//        this(name);
//        this.address = address;
//    }
}
