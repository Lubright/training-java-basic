package com.examples.ex16_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    private static void listDemoWithGeneric(){
        List<Integer> list = new ArrayList<>(); // auto assert

        list.add(1);
        list.add(2);

//        list.add("1"); // error occurred

        Iterator<Integer> iter1 = list.iterator();

        while(iter1.hasNext()){
            Integer temp = iter1.next();
            System.out.print(temp + ", ");
        }
        System.out.println();

        System.out.println("List: " + list);
    }

    public static void main(String[] args) {
        listDemoWithGeneric();
    }
}
