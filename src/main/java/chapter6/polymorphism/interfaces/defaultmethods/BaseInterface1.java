package chapter6.polymorphism.interfaces.defaultmethods;

interface BaseInterface1 {
    default void getName() { System.out.println("Base 1"); }
}
