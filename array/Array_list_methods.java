package com.company.array;

import  java.util.*;

public class Array_list_methods {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l2.add(13);
        l2.add(15);
        l2.add(18);

        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(0,5);

        l1.addAll(0,l2);
        l1.set(4,4);
        l1.remove(5);
        //l1.clear();
        System.out.println(l1.contains(25));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(4));


        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }

    }
}
