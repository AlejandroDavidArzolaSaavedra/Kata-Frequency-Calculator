package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        Integer [] data = { 1 , 4 , 1 , 100 , 2 , -4 , 100 ,
                       100 , 1 , 2 , 6 , 100 ,  8 , 4 , 
                       4 , 4 , 100 , 4 , 5 , 5 , 5 ,
                       5 , 5 , 5 , 6 , 100 , 6 , 6 ,
                       100 , 6 , 6 , 6 , 6 , 8 , 6 };
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
            }
        }

    }
