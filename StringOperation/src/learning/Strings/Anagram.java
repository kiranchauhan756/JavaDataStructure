package learning.Strings;

import java.util.*;

class Solution22 {
    public boolean isAnagram(String s, String t) {
        
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        
        List <Character> l1=new ArrayList<>();
        List <Character> l2=new ArrayList<>();
        
        for(char x:c1)l1.add(x);
        for(char y:c2)l2.add(y);
        
       Collections.sort(l1);
       Collections.sort(l2);
       if(l1.equals(l2))return true;
       
       return false;
    }
}
public class Anagram {

	public static void main(String[] args) {
		
	}

}
