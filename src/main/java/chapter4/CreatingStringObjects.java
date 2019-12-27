package chapter4;

public class CreatingStringObjects {
    public static void main(String[] args) {
        String str1 = new String("Paul");
        String str2 = new String("Paul");
        System.out.println(str1 == str2); //false

        String str3 = "Harry";
        String str4 = "Harry";
        System.out.println(str3 == str4); //true, same object in String pool

        String morning1 = "Morning"; //placed to String pool
        System.out.println("Morning" == morning1); //true

        String morning2 = new String("Morning");//not placed to String pool
        System.out.println("Morning" == morning2); //false

        String girl = new String("Shreya");
        char[] name = new char[]{'P','a','u','l'};
        String boy = new String(name);

        StringBuilder sb1 = new StringBuilder("String Builder");
        String str5 = new String(sb1);
        StringBuffer sb2 = new StringBuffer("String Buffer");
        String str6 = new String(sb2);

        StringBuilder sb3 = new StringBuilder("123456");
        sb3.subSequence(2, 4);
        sb3.deleteCharAt(3);
        sb3.reverse();
        System.out.println(sb3);
    }
}
