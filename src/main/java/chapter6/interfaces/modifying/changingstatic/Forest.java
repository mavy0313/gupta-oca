package chapter6.interfaces.modifying.changingstatic;

class Forest {
    public static void main(String[] args) {
        Animal lion = new Animal();
        System.out.println(Jumpable.maxDistance());
    }
}
