package chapter6.interfaces.modifying.changingdefault;

class Forest {
    public static void main(String[] args) {
        Jumpable lion = new Animal();
        System.out.println(lion.maxDistance());
    }
}
