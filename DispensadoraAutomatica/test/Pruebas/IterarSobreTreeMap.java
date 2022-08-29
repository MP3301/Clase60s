package Pruebas;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class IterationDemo {
    public static void main(String[] arg)
    {
        TreeMap<String, String> gfg = new TreeMap<>();
 
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        Set set;
        set = gfg.descendingKeySet();
        Iterator iter;
        iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(gfg.get(iter.next()));
        }
    }
}
