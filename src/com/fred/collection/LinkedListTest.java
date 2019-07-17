package com.fred.collection;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addFirst(0);
        linkedList.addLast(3);
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
    }
}
