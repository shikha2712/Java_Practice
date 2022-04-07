package com.company.array;

import java.util.ArrayDeque;

public class arrayDeque_methods {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(56);
        ad1.add(54);
        ad1.add(94);
        ad1.add(68);

        ad1.addFirst(23);
        ad1.addLast(74);

        ad1.removeFirst();
        ad1.removeLast();

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
