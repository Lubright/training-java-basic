package com.examples.ex14_ExceptionDemo;

import java.io.*;

public class ex14_FinallyReleaseResource {

    public static void ls(String path) {

        File file = new File(path);
        File[] files = file.listFiles();

        System.out.println("path\t" + file.getAbsolutePath());

        for(int i=0; i<files.length; i++) {
            if(files[i].isDirectory()) {
                System.out.println("<Dir>\t" + files[i].getName());
            }
            else {
                System.out.println(String.format("%s\t%d Bytes", files[i].getName(), files[i].length()));
            }
        }

    }

    public static void showFileContentWithReadLine(BufferedReader fin) throws IOException {

        String s1;

        while( (s1 = fin.readLine()) != null ) {

            System.out.println(s1);

        }

        fin.close();

    }

    public static void main(String[] args) {
        InputStream in = null;
        BufferedReader buffer = null;
        try{
            System.out.println("Opening a file...");
//            ls("./");
            in = new FileInputStream("./src/com/examples/ex1_ExceptionDemo/ex1_FinallyReleaseResource.java");
            buffer = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            showFileContentWithReadLine(buffer);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{ // release resource
            if(in!=null){
                try {
                    in.close();
                    buffer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
