package com.examples.ex15_Generic;

class MyString{
    private String message = "";
    public void set(String message){
        this.message = message;
    }
    public String get(){
        return this.message;
    }
    public String toString(){
        return message;
    }
}

class MyShirt{
    private MyShirt shirt;

    public void set(MyShirt shirt){
        this.shirt = shirt;
    }

    public MyShirt get(){
        return shirt;
    }
}

class Something<T>{
    private T t;

    public void set(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
}

public class GenericDemo {

    public static void main(String[] args) {
        MyString s1 = new MyString();
        MyShirt shirt = new MyShirt();

        s1.set("test MyString");

        // use generic
        Something<MyShirt> shirt2 = new Something<MyShirt>();
        Something<MyString> s2 = new Something<>();

        s2.set(s1); // put MyString object
        System.out.println(s2.get()); // return object and using toString to show object description
    }

}
