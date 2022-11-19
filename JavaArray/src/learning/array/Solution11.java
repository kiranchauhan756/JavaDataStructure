package learning.array;

import java.util.*;
//more than n/2 times

class Sol {
	 public String convertToBase7(int num) {
	        String s="",t="";
	        if(num<0) {
	        	num=Math.abs(num);
	           t+="-";
	        }
	        int rem;
	        while(num!=0){
	           rem=num%7;// 100/7 //2
	            s+=rem;
	            num=num/7;
	        }
	       for(int i=s.length()-1;i>=0;i--) {
	    	   t+=s.charAt(i);
	       }
	        return t;
	    }
}

public class Solution11 {

	public static void main(String[] args) {

		Sol s = new Sol();
		System.out.println(s.convertToBase7(32));
	}
}
