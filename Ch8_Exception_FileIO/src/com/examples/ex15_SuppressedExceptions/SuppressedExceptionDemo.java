package com.examples.ex15_SuppressedExceptions;

class Exception1 extends Exception{

}

class Exception2 extends Exception{

}

public class SuppressedExceptionDemo {

    public static void main(String[] args) {
        after7();
    }

    private static void before7(){
        try{
            try{
                throw new Exception1();
            }
            finally {
                throw new Exception2();
            }
        }
        catch(Exception e){
            System.out.println("before7: " + e.getClass());
        }
    }
    private static void after7(){
        try{
            Throwable t = null;
            try{
                throw new Exception1();
            }
            catch(Exception e){
                t = e;
                System.out.println("test1");
            }
            finally{
                Exception2 fe = new Exception2();
                if(t!=null){
                    System.out.println("test2");
                    t.addSuppressed(fe);
                    throw t;
                }
                else{
                    System.out.println("test3");
                    throw fe;
                }
            }
        }
        catch(Throwable e){
            System.out.println("after7_1: " + e.getClass());
            for(Throwable t : e.getSuppressed()){
                System.out.println("after7_2: " + t.getClass());
            }

        }
    }

}
