package learning.Strings;

//counting frequency of every charcater in a String Alphabetically
import java.util.*;

class Solution5 {
	void countingFreq(String m) {
		TreeMap<Character, Integer> s = new TreeMap<>();
		char t[] = m.toCharArray();
		for (char x : t) {
			if (s.containsKey(x)) {
				s.put(x, s.get(x) + 1);
			} else {
				s.put(x, 1);
			}
		}
       for(Map.Entry e : s.entrySet()) {
    	   System.out.println(e.getKey()+" "+e.getValue());
       }
	}
}

public class Counting_Frequency {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		s.countingFreq("loveleetcode");
	}

}
