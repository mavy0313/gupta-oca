package chapter6.polymorphism.interfaces.defaultmethods;

interface BaseInterface2 {
    default void getName() { System.out.println("Base 2"); }
}
