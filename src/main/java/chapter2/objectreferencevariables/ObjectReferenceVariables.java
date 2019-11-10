package chapter2.objectreferencevariables;

import java.util.Objects;

public class ObjectReferenceVariables {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        int primitiveVar = 77;
        ObjectReferenceVariables obj = new ObjectReferenceVariables();
        ObjectReferenceVariables obj2 = new ObjectReferenceVariables();

        System.out.println(obj == obj2); //false

        obj.setAge(10);
        obj2.setAge(10);
        System.out.println(obj.equals(obj2)); //false
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectReferenceVariables that = (ObjectReferenceVariables) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
