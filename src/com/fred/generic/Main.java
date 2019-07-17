package com.fred.generic;

import java.util.ArrayList;

public class Main<T> {

    public static void main(String[] args) {

    }

    public void foo(ArrayList<? extends SuperClass> classes) {
        // cannot be modified
//        classes.add(new SuperClass() {
//            @Override
//            public void echo() {
//
//            }
//        });
    }
}

interface SuperClass {

    void echo();
}

class ExtendClassA implements SuperClass {

    @Override
    public void echo() {
        System.out.println("extend class");
    }
}
