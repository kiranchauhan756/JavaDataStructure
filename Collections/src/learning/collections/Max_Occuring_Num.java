package learning.collections;

import java.util.Map.Entry;
import java.util.*;

class Solution2
{
	public int maxOccur(int a[]){
		HashMap <Integer,Integer>s=new HashMap<>();
		for(int x:a) {
			if(s.containsKey(x)) {
				s.put(x, s.get(x)+1);
			}
			else {
				s.put(x, 1);
			}
		}
		int maxkey=Collections.max(s.values());
		int result=0;
		for(Entry<Integer,Integer> e: s.entrySet()) {
			if(e.getValue()==maxkey) {
				result=e.getKey();
			}
		}
		return result;
	}
}
	public class Max_Occuring_Num {
	public static void main(String[] args) {
		Solution2 s=new Solution2();
		int a[]= {1,5,5,5,5,9,7,2,2,2,0,2,7,2};
		System.out.println(s.maxOccur(a));
	}

}
