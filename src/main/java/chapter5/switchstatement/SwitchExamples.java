package chapter5.switchstatement;

public class SwitchExamples {
    public static void main(String[] args) {
        Integer value = null;
//        switch (value) { //NPE
//            default: System.out.println("value is not 10");
//                break;
//            case 10: System.out.println("value is 10");
//                break;
//        }
        //allowed types: char, byte, short, int, Character, Byte, Short, Integer, String, enum

        int a=10, b=20, c=30;
        switch (a) {
//            case b+c: System.out.println(b+c); break; constant expression required
            case 10*7: System.out.println(10*7512+10); break;
        }

        final int a1 = 10;
        final int b1 = 20;
        final int c1 = 30;
        switch (a1) {
            case b1+c1: System.out.println(b1+c1); break;
        }

        final int a2 = 10;
        final int b2 = 20;
        final int c2;
        c2 = 30; // should be initialized in declaration tobe compile-time constant
//        switch (a2) {
//            case b2+c2: System.out.println(b2+c2); break; - won't compile
//        }

//        byte myByte = 10;
//        switch (myByte) {
//            case 1.2: System.out.println(1); break; //float not allowed in case - switch and case should be the same type
//        }

//        String name = "Paul";
//        switch (name) {
//            case "Paul": System.out.println(1);
//                break;
//            case null: System.out.println("null"); // null not allowed in case label values
//        }
    }
}
