package chapter2.wrapperclasses;

public class Main {
    public static void main(String[] args) {
        Boolean bool1 = true;
        Character char1 = 'a';
        Byte byte1 = 10;
        Double double1 = 10.98;

        Boolean bool2 = new Boolean(true);
        Character char2 = new Character('a');
        Byte byte2 = new Byte((byte) 10);
        Double double2 = new Double(10.98);

//        Character char3 = new Character("a");
        Boolean bool3 = new Boolean("true");
        Byte byte3 = new Byte("10");
        Double double3 = new Double("10.98");

        Boolean bool4 = Boolean.valueOf(true);
        Boolean bool5 = Boolean.valueOf(true);
        Boolean bool6 = Boolean.valueOf("TrUE");
        Double double4 = Double.valueOf(10);

        System.out.println(double4.doubleValue());

        System.out.println(Long.parseLong("1234"));
        try {
            Byte.parseByte("1024");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println(Boolean.parseBoolean("TrUe"));
        System.out.println(Boolean.parseBoolean("NotBooleanShouldReturnFalse"));

        //
        Long var1 = Long.valueOf(123);
        Long var2 = Long.valueOf("123");
        System.out.println(var1 == var2); // true - refer to the same cached object

        Long var3 = Long.valueOf(223);
        Long var4 = Long.valueOf(223);
        System.out.println(var3 == var4); //false - refer to different objects, -128 to 127 are cached

        //

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf(10);

        Integer i5 = 10;
        Integer i6 = 10;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        System.out.println(i4 == i5);
        System.out.println(i5 == i6);

        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i4));
        System.out.println(i4.equals(i5));
        System.out.println(i5.equals(i6));

        Integer ii1 = new Integer(200);
        Integer ii2 = new Integer(200);
        Integer ii3 = Integer.valueOf(200);
        Integer ii4 = Integer.valueOf(200);
        Integer ii5 = 200;
        Integer ii6 = 200;

        System.out.println(ii1 == ii2);
        System.out.println(ii3 == ii4);
        System.out.println(ii4 == ii5);
        System.out.println(ii5 == ii6);

        Integer obj1 = 100;
        Short obj2 = 100;
        System.out.println(obj1.equals(obj2)); // - false
//        System.out.println(obj1 == obj2); - doesn't compile

    }
}
