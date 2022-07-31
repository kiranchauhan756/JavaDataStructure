package learning.Strings;

import java.util.*;

class Run {
	public int lengthOfLastWord(String s) {
		s.trim();
         int nums[]=new int [s.length()/2];
         int k=0,p=s.length(),last;
         for(int i=0;i<s.length();i++) {
        	 if(s.charAt(i)==' ') {
        		 nums[k]=i;
        		 k++;
        		 p--;
        	 }
         }
        Arrays.sort(nums);
         
		return s.length()-nums[nums.length-2];
	}
}

public class Length_of_last_word {

	public static void main(String[] args) {
		Run s = new Run();
		System.out.println(s.lengthOfLastWord("I will do my best"));

	}

}
