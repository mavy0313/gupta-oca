package chapter6.interfaces.modifying.changingabstract;

class Forest {
    public static void main(String[] args) {
        Animal lion = new Animal();
        System.out.println(lion.maxDistance()); //101
        System.out.println(Jumpable.maxDistance()); //200
    }
}
