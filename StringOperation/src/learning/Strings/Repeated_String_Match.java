package learning.Strings;
//return the first occurance of String b in a 
import java.util.*;

class Solution {
    public int repeatedStringMatch(String a, String b) {
    	if(b.isEmpty()) return 0;
        return a.indexOf(b);
    }
}
public class Repeated_String_Match {

	public static void main(String[] args) {
	Solution s=new Solution();
	System.out.println(s.repeatedStringMatch("aaaa", "bba"));

	}

}
