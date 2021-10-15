package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int [] data = { 1 , 4 , 1 , 100 , 2 , -4 , 100 ,
                       100 , 1 , 2 , 6 , 100 ,  8 , 4 , 
                       4 , 4 , 100 , 4 , 5 , 5 , 5 ,
                       5 , 5 , 5 , 6 , 100 , 6 , 6 ,
                       100 , 6 , 6 , 6 , 6 , 8 , 6 };
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
            for (int key : data) {
                histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
            }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
            }
        }

    }
