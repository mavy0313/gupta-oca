package chapter6.interfaces.extending.samedefaultmethodnames;

//interface MyInterface extends BaseInterface1, BaseInterface2 { //won't compile inherits unrelated defaults for getName()
//}

interface MyInterface extends BaseInterface1, BaseInterface2 {
    default void getName() {
        BaseInterface1.super.getName();
        BaseInterface2.super.getName();
        System.out.println("Just me");
    }
}
