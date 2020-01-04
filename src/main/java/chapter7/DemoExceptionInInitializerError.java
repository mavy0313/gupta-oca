package chapter7;

class DemoExceptionInInitializerError {
//    static {
//        int num = Integer.parseInt("sd", 16);
//    }

//    static String name = null;
//    static int nameLength = name.length();

    static String name = getName();
    static String getName() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
