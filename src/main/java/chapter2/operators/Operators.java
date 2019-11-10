package chapter2.operators;

public class Operators {
    public static void main(String[] args) {
        byte age1 = 10;
        byte age2 = 20;
//        short sum = age1 + age2;  byte, short, char widened to int when used as operands for arithmetic operations

        final byte age3 = 10;
        final byte age4 = 20;
        short sum = age3 + age4; //compiler is assured that value 30 can be assigned to short type

        int a = 10;
        a = a++ + a + a-- - a-- + ++a; //10 + 11 + 11 - 10 + 10 = 32
        System.out.println(a);
//        The evaluation of an expression starts from left to right. For a prefix unary operator,
//        the value of its operand increments or decrements just before its value is used in an
//        expression. For a postfix unary operator, the value of its operand increments or decrements
//        just after its value is used in an expression

        int a1 = 10;
        a1 = ++a1 + a1 + --a1 - --a1 + a1++; //11 + 11 + 10 - 9 + 9 = 32
        System.out.println (a1);
    }
}
