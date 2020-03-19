package com.examples.ex18_Queue;


import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {

    private static void testStack(){
        Deque<String> stack = new ArrayDeque<String>();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println("first E: " + stack.getFirst());
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.pop();
        stack.clear();

        System.out.println(stack);

    }

    private static void testQueue(){
        Deque<String> queue = new ArrayDeque<String>();

        queue.add("one");
        queue.add("two");
        queue.add("three");

        System.out.println("first E: " + queue.getFirst());
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
        queue.remove();
        queue.clear();
        System.out.println(queue);

    }

    public static void main(String[] args) {
        System.out.println("testStack");
        testStack();

        System.out.println("testQueue");
        testQueue();
    }
}
