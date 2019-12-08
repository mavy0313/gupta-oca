package chapter4.arrays;

public class CreateArray {
    public static void main(String args[]) {
        int intArray[] = new int[] {4, 8, 107};
        String objArray[] = new String[] {"Harry", "Shreya", "Paul", "Selvan"};

        int intArray2[];
        String[] strArray;
        int[] multiArr[];
        intArray2 = new int[2];
        strArray = new String[4];
        multiArr = new int[2][3];

        strArray = new String[2*5]; //array size should be int
        int x = 10, y = 4;
        strArray = new String[x*y];
        strArray = new String[Math.max(2, 3)];

        int[] multiArr2[];
        multiArr2 = new int[2][3];
        multiArr2 = new int[2][]; //ok
//        multiArr2 = new int[][3]; not ok

        int intArray3[];
        intArray3 = new int[2];
        for (int i=0; i<intArray3.length; i++) {
            intArray3[i] = i + 5;
        }

        intArray3[0] = 10;
        intArray3[1] = 1870;

        String[] strArray2;
        strArray2 = new String[4];
        for (int i=0; i<strArray2.length; i++) {
            strArray2[i] = new String("Hello" + i);
        }
        strArray2[1] = "Summer";
        strArray2[3] = "Winter";
        strArray2[0] = "Autumn";
        strArray2[2] = "Spring";

        int[] multiArr3[];
        multiArr3 = new int[2][3];
        for (int i=0; i<multiArr3.length; i++) {
            for (int j=0; j<multiArr3[i].length; j++) {
                multiArr3[i][j] = i + j;
            }
        }
        multiArr3[0][0] = 10;
        multiArr3[1][2] = 1210;
        multiArr3[0][1] = 110;
        multiArr3[0][2] = 1087;

        int intArray4[] = new int[2];
//        System.out.println(intArray4[3]);  ArrayIndexOutOfBoundsException

        int intArray5[] = {0, 1};
        String[] strArray3 = {"Summer", "Winter"};
        int multiArray[][] = { {0, 1}, {3, 4, 5} };

        int intArray6[] = new int[]{0, 1};
        String[] strArray4 = new String[]{"Summer", "Winter"};
        int multiArray2[][] = new int[][]{ {0, 1}, {3, 4, 5}};

//        Won't compile
//        int intArray7[] = new int[2]{0, 1};
//        String[] strArray5 = new String[2]{"Summer", "Winter"};
//        int multiArray3[][] = new int[2][]{ {0, 1}, {3, 4, 5}};
    }
}
