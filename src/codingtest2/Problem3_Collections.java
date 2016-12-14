package codingtest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class Problem3_Collections {
    
    public static void main(String[] args) {
        Problem3_Collections pc = new Problem3_Collections();
        pc.collectionFun();
    }
	public void collectionFun() {
		//Requirements: Generate 100 random numbers between 1-1000.
		//	Put the numbers into a Map.  Then move them to a Set.
		//  Then move the numbers into a List.  Then sort the numbers.
		//	Finally output the numbers, with one number on every row
		          Map<Integer, Integer> map =  new HashMap<>();
                          Set<Integer> setPerson = new HashSet<Integer>();
                          List<Integer> list = new ArrayList<>();
                for (int i = 1; i < 100; i++) {
                    Random ran = new Random();
                    int n = ran.nextInt(1000);
                map.put(n, n);
                }
                
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer key = entry.getKey();
                Integer value = entry.getValue();
		setPerson.add(value);
                
                list.add(value);
                }
                
                Collections.sort(list);
                
                for (int i = 0; i < list.size(); i++) {
                Integer get = list.get(i);
                System.out.println(get);
            }
		
                
		
		
	}
}
