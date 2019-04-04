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
    }
}
