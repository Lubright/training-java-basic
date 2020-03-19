package com.examples.ex17_Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    private static void setDemo(){
        Set<String> set = new HashSet<>();

        set.add("1");
        set.add("b");

        for(String s : set){
            System.out.print(s + ", ");
        }
        System.out.println();

        System.out.println("set: " + set);

    }

    public static void main(String[] args) {
        setDemo();
    }
}
