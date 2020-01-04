package chapter7;

class Handle {
    public static void main(String args[]) {
        RiverRafting riverRafting = new RiverRafting();
        try {
            riverRafting.crossRapid(9);
        } catch (FallInRiverException e) {
            System.out.println("Exception : " + e);
        }
    }
}
