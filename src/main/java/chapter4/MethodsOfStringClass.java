package chapter4;

public class MethodsOfStringClass {

  public static void main(String[] args) {
    String name = new String("Paul");
    System.out.println(name.charAt(0)); //P
    System.out.println(name.charAt(2)); //u
//    System.out.println(name.charAt(4)); RuntimeException

    String letters = "ABCAB";
    System.out.println(letters.indexOf('B')); //1
    System.out.println(letters.indexOf("S")); //-1
    System.out.println(letters.indexOf("CA")); //2
    System.out.println(letters.indexOf('B', 2)); //4

    String exam = "Oracle";
    String sub = exam.substring(2);
    System.out.println(sub); //acle

    String exam2 = "Oracle";
    String result = exam2.substring(2, 4);
    System.out.println(result); //ac

    String varWithSpaces = " AB CB    ";
    System.out.print(":");
    System.out.print(varWithSpaces);
    System.out.print(":");

    System.out.print(":");
    System.out.print(varWithSpaces.trim());
    System.out.print(":");
    System.out.println();

    String letters2 = "ABCAB";
    System.out.println(letters2.replace('B', 'b'));
    System.out.println(letters2.replace("CA", "12"));

//    String letters3 = "ABCAB";
//    System.out.println(letters3.replace('B', "b")); Won't compile parameters are mixed
//    System.out.println(letters3.replace("B", 'b')); Won't compile
    System.out.println(letters2);

    System.out.println("Shreya".length()); //6

    String letters4 = "ABCAB";
    System.out.println(letters4.startsWith("AB")); //true
    System.out.println(letters4.startsWith("a")); //false
    System.out.println(letters4.startsWith("A", 3)); //true

    System.out.println();

    System.out.println(letters.endsWith("CAB")); //true
    System.out.println(letters.endsWith("B")); //true
    System.out.println(letters.endsWith("b")); //false

    System.out.println();

    String result2 = "Sunday  ".replace(' ', 'Z').trim().concat("M n");
    System.out.println(result2); //SundayZZM n

    System.out.println();

    String day = "SunDday";
    day.replace('D', 'Z').substring(3);
    System.out.println(day); //SunDday
    day = day.replace('D', 'Z').substring(3);
    System.out.println(day); //Zday

    String letters5 = "ABCAB";
//    System.out.println(letters5.substring(0, 2).startsWith('A')); won't compile need to pass String to startsWith
  }

}
