package examples.ex4_Map;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import examples.ex5_TimeMeasure.MeasurementTimer;

/**
 * ex2_HashMap1
 */
public class ex4_HashMap1 {

    public static void main(String[] args) throws IOException {
        HashMap<String, String> dict = new HashMap<String, String>();

        FileReader fin = new FileReader("data.txt");
        BufferedReader buf = new BufferedReader(fin);
        String line;

        MeasurementTimer timer = new MeasurementTimer("suite1");
        timer.start("1");
        
        while( (line = buf.readLine()) != null ){
            String[] dataArray = line.split(",");
            dict.put(dataArray[0],dataArray[1]); // put key-value data to hashmap
        }
        buf.close();
        fin.close();

        timer.tick("2");
        
        // System.out.println(dict); // {apple=蘋果, cat=貓, bear=熊, house=房子, bunny=小兔子, hamburger=漢堡}

        // access data by key
        System.out.println(dict.get("apple"));

        // traverse
        // 1. use Iterator (interface)
        Set set = dict.keySet();
        // System.out.println(set); // [apple, cat, bear, house, bunny, hamburger]
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            String key = (String)iter.next();
            System.out.printf("%s -> %s\n", key, dict.get(key));
        }

        // 2. use for each
        for(Object key : dict.keySet()){
            System.out.printf("%s -> %s\n", key, dict.get((String)key)); // use downcasting
        }

        timer.tick();
        timer.show();

    }

}