package codingtest2;

import java.util.HashSet;
import java.util.Set;

public class Problem4_Match {
    
    public static void main(String[] args) {
        Problem4_Match match = new Problem4_Match();
        Person pMatt_1 = new Person("Matt", (byte)36, "1678", "PHX", "AZ", (short)85085);
        Person pMatt_2 = new Person("Matt", (byte)36, "1678", "PHX", "AZ", (short)85085);
        
        System.out.println(match.doTheyMatch(pMatt_1, pMatt_2));
    }
	public boolean doTheyMatch(Person p1, Person p2) {
                boolean f1= false, f2 = false;
		//Are they equal?
		if (p1.equals(p2)) {
                    f1= true;
                }
		//If I add both to a Set does it enforce uniqueness?
		Set<Person> setPerson = new HashSet<Person>();
		setPerson.add(p1);
                if (setPerson.add(p2)) 
                    f2 = true;
		//If both conditions above are true, then return true, else false;
                
                if (f1 && f2) 
                    return true;
                else
                    return false;
	}
}
