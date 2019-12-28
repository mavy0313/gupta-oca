package chapter6.interfaces.implmultipleinterfaces.sameconstants;

class Animal implements Jumpable, Moveable {
    Animal() {
//        System.out.println(MIN_DISTANCE);  won't compile - ambiguous
        System.out.println(Jumpable.MIN_DISTANCE);
        System.out.println(MAX_DISTANCE); // not ambiguous
    }
}
