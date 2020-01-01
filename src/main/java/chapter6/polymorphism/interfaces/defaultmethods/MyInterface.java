package chapter6.polymorphism.interfaces.defaultmethods;

interface MyInterface extends BaseInterface1, BaseInterface2 {
    default void getName() { System.out.println("Just me"); }
}
