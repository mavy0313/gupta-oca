package chapter7.npe;

class ThrowAnotherNullPointerException {
    static String[] oldLaptops;
    public static void main(String[] args) {
        System.out.println(oldLaptops[1]);

        String[] newLaptops = new String[2];
        System.out.println(newLaptops[1].toString());
    }
}
