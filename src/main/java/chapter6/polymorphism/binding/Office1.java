package chapter6.polymorphism.binding;

class Office1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee programmer = new Programmer();
        System.out.println(emp.name);
        System.out.println(programmer.name);
        emp.printName();
        programmer.printName();
    }
//    output:
//    Employee
//    Employee
//    Employee
//    Programmer
    //With inheritance, the instance variables bind at compile time and the methods bind at runtime
}
