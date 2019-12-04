package chapter4;

public class EqualityOfStrings {
    public static void main(String[] args) {
        String var1 = new String("Java");
        String var2 = new String("Java");
        System.out.println(var1.equals(var2)); //true
        System.out.println(var1 == var2); //false

        String var3 = "code";
        String var4 = "code";
        System.out.println(var3.equals(var4)); //true
        System.out.println(var3 == var4); //true

        String var5 = new String("Java");
        String var6 = new String("Java");
        System.out.println(var5.equals(var6)); //true
        System.out.println(var5 == var6); //false
        System.out.println(var5 != var6); //true

        String var7 = "code";
        String var8 = "code";
        System.out.println(var7.equals(var8)); //true
        System.out.println(var7 == var8); //true
        System.out.println(var7 != var8); //false

        String lang1 = "Java";
        String lang2 = "JaScala";
        String returnValue1 = lang1.substring(0,1);
        String returnValue2 = lang2.substring(0,1);
        System.out.println(returnValue1); //J
        System.out.println(returnValue2); //J
        System.out.println(returnValue1 == returnValue2); //false
        System.out.println(returnValue1.equals(returnValue2)); //true
    }
}
