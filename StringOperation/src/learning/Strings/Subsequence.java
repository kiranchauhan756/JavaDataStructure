package learning.Strings;

//Check if a String is  Subsequence or nt
import java.util.*;

class Check {
	
	public boolean isSubsequence(String s, String t) {
        if(s.length()==0)return true;
        if(t.length()==0)return false;
        int s1=0;
        int t1=0;
        while(t1 < t.length()) {
        	if(t.charAt(t1)==s.charAt(s1)) {
        		s1++;
        	if(s1==s.length())return true;
        	}
        	t1++;
        }
        return false;
	}
}

public class Subsequence {

	public static void main(String[] args) {
		Check s = new Check();
		System.out.println(s.isSubsequence("acb", "ahbgdc"));
	}

}
