package chapter7;

class HandleAndDeclare {
    public static void main(String args[]) throws FallInRiverException {
        RiverRafting riverRafting = new RiverRafting();
        try {
            riverRafting.crossRapid(9);
        } catch (FallInRiverException e) {
            System.out.println("Exception : " + e);
        }
    }
}
