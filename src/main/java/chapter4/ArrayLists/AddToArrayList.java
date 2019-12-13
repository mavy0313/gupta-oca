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
    }
}
