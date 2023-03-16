package org.example.lection;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        Object o = 1; GetType(o);
        o = 1.2; GetType(o);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2809);

        for (Object index : list){
            System.out.println(index);
        }
    }

    private static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}
