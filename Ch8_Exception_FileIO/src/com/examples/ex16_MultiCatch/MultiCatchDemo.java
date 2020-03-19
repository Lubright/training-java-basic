package com.examples.ex16_MultiCatch;

import java.io.File;
import java.io.IOException;

public class MultiCatchDemo {
    public static void main(String[] args) {
        after7();
    }

    private static void before7(){
        try{
            createTempFile();
        }
        catch(IOException e){
            System.out.println(e.getClass());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getClass());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass());
        }
        catch(SecurityException e){
            System.out.println(e.getClass());
        }
        catch(Exception e){
            System.out.println("Unexpected Exception: " + e.getClass());
        }
    }

    private static void after7(){
        try{
            createTempFile();
        }
        catch(IOException | IllegalArgumentException | ArrayIndexOutOfBoundsException | SecurityException e){
//            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Unexpected Exception: " + e.getClass());
        }
    }

    private static void createTempFile() throws IOException {
        String path = System.getProperty("user.dir");
        System.out.println("path : " + path); // path : D:\Java\training-java-basic\Ch10_Event_Handling

        path += "/src/com/examples/ex3_MultiCatch";

        File file = new File(path);
        File tempFile = File.createTempFile("jie", null, file);
        System.out.println("temp file name : " + tempFile.getPath());
        int arr[] = new int[5];

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tempFile.deleteOnExit(); // auto delete file when vm is terminated
    }
}
