package chapter6.lambda.passingvalues;

import java.util.ArrayList;
import java.util.function.Predicate;

class Test {
    public static void main(String args[]) {
        Emp e1 = new Emp("Shreya", 5, 9999.00);
        Emp e2 = new Emp("Paul", 4, 1234.00);
        Emp e3 = new Emp("Harry", 5, 8769.00);
        Emp e4 = new Emp("Selvan", 1, 2769.00);
        ArrayList<Emp> empArrList = new ArrayList<>();
        empArrList.add(e1);
        empArrList.add(e2);
        empArrList.add(e3);
        empArrList.add(e4);
//        filter(empArrList, new ValidatePerformanceRating());
//        Validate validatePerfor = e -> e.getPerformanceRating() >= 5;
//        filter(empArrList, validatePerfor);
        Predicate<Emp> predicate = e -> e.getPerformanceRating() >= 5;
        filter(empArrList, predicate);

        for (Emp e : empArrList)
            System.out.println(e);
        System.out.println("After deletion..");
        empArrList.removeIf(e -> e.getName().startsWith("S"));
        for (Emp e : empArrList)
            System.out.println(e);
    }
//    static void filter(ArrayList<Emp> list, Validate rule) {
//        for (Emp e : list) {
//            if (rule.check(e)) {
//                System.out.println(e);
//            }
//        }
//    }
    static void filter(ArrayList<Emp> list, Predicate<Emp> rule) {
        for (Emp e : list) {
            if (rule.test(e)) {
                System.out.println(e);
            }
        }
    }
}
