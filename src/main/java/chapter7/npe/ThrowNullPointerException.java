package chapter7.npe;

import java.util.ArrayList;

class ThrowNullPointerException {
    static ArrayList<String> list = null;
//    ArrayList<String> list;
    public static void main(String[] args) {
//        list.add("1");
//        ThrowNullPointerException obj = new ThrowNullPointerException();
//        obj.list.add("1");
//        ArrayList<String> list;
        if (list!=null)
            list.add("1");
    }
}
