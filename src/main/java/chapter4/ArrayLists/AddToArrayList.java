package chapter4.ArrayLists;

import java.util.ArrayList;
import java.util.ListIterator;

public class AddToArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("four");
        list.add(2, "three");

        System.out.println(list);

        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("One");
        myArrList.add("Two");
        myArrList.add("Four");
        myArrList.add(2, "Three");
        for (String element : myArrList) {
            System.out.println(element);
        }

        ListIterator<String> iterator = myArrList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<String> myArrList2 = new ArrayList<String>();
        myArrList2.add("One");
        myArrList2.add("Two");
        myArrList2.add("Three");
        myArrList2.set(1, "One and Half");
        for (String element : myArrList2)
            System.out.println(element);

        ArrayList<StringBuilder> myArrList3 = new ArrayList<StringBuilder>();
        myArrList3.add(new StringBuilder("One"));
        myArrList3.add(new StringBuilder("Two"));
        myArrList3.add(new StringBuilder("Three"));
        for (StringBuilder element : myArrList3)
            element.append(element.length());
        for (StringBuilder element : myArrList3)
            System.out.println(element);

        ArrayList<StringBuilder> myArrList4 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("One");
        StringBuilder sb2 = new StringBuilder("Two");
        StringBuilder sb3 = new StringBuilder("Three");
        StringBuilder sb4 = new StringBuilder("Four");
        myArrList4.add(sb1);
        myArrList4.add(sb2);
        myArrList4.add(sb3);
        myArrList4.add(sb4);
        myArrList4.remove(1);

        for (StringBuilder element:myArrList4)
            System.out.println(element);

        myArrList4.remove(sb3);
        myArrList4.remove(new StringBuilder("Four"));
        System.out.println();

        for (StringBuilder element : myArrList4)
            System.out.println(element);

        ArrayList<String> myArrList5 = new ArrayList<String>();
        myArrList5.add("One");
        myArrList5.add("Two");
        ArrayList<String> yourArrList = new ArrayList<String>();
        yourArrList.add("Three");
        yourArrList.add("Four");
        myArrList5.addAll(1, yourArrList);
        for (String val : myArrList5)
            System.out.println(val);

//        One
//        Three
//        Four
//        Two

        ArrayList<String> myArrList6 = new ArrayList<String>();
        myArrList6.add("One");
        myArrList6.add("Two");
        myArrList6.clear();
        for (String val:myArrList6) //empty output
            System.out.println(val);

        ArrayList<String> myArrList7 = new ArrayList<String>();
        myArrList7.add("One");
        myArrList7.add("Two");
        String valFromList = myArrList7.get(1);
        System.out.println(valFromList); //Two
        System.out.println(myArrList7.size()); //2

        ArrayList<StringBuilder> myArrList8 =
                new ArrayList<StringBuilder>();
        StringBuilder sb_1 = new StringBuilder("Jan");
        StringBuilder sb_2 = new StringBuilder("Feb");
        myArrList8.add(sb_1);
        myArrList8.add(sb_2);
        myArrList8.add(sb_2);
        System.out.println(myArrList8.contains(new StringBuilder("Jan"))); //false
        System.out.println(myArrList8.contains(sb_1)); //true
        System.out.println(myArrList8.indexOf(new StringBuilder("Feb"))); //-1
        System.out.println(myArrList8.indexOf(sb_2)); //1
        System.out.println(myArrList8.lastIndexOf(new StringBuilder("Feb"))); //-1
        System.out.println(myArrList8.lastIndexOf(sb_2)); //2

        ArrayList<MyPerson> myArrList9 = new ArrayList<MyPerson>();
        MyPerson p1 = new MyPerson("Shreya");
        MyPerson p2 = new MyPerson("Paul");
        myArrList9.add(p1);
        myArrList9.add(p2);
        myArrList9.add(p2);
        System.out.println(myArrList9.contains(new MyPerson("Shreya"))); //true
        System.out.println(myArrList9.contains(p1)); //true
        System.out.println(myArrList9.indexOf(new MyPerson("Paul"))); //1
        System.out.println(myArrList9.indexOf(p2)); //1
        System.out.println(myArrList9.lastIndexOf(new MyPerson("Paul"))); //2
        System.out.println(myArrList9.lastIndexOf(p2)); //2

        ArrayList<StringBuilder> myArrList10 = new ArrayList<StringBuilder>();
        StringBuilder sb__1 = new StringBuilder("Jan");
        StringBuilder sb__2 = new StringBuilder("Feb");
        myArrList10.add(sb__1);
        myArrList10.add(sb__2);
        myArrList10.add(sb__2);
        ArrayList<StringBuilder> assignedArrList = myArrList10;
        ArrayList<StringBuilder> clonedArrList =
                (ArrayList<StringBuilder>)myArrList10.clone();
        System.out.println(myArrList10 == assignedArrList); //true
        System.out.println(myArrList10 == clonedArrList); //false
        StringBuilder myArrVal = myArrList10.get(0);
        StringBuilder assignedArrVal = assignedArrList.get(0);
        StringBuilder clonedArrVal = clonedArrList.get(0);
        System.out.println(myArrVal == assignedArrVal); //true
        System.out.println(myArrVal == clonedArrVal); //true
    }
}
