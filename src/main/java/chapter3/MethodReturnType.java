package chapter3;

public class MethodReturnType {

    public int returnByte() {
        byte a = 1;
        return a;
    }

    public static void main(String[] args) {
        MethodReturnType methodReturnType = new MethodReturnType();
        System.out.println(methodReturnType.returnByte());
    }
}
