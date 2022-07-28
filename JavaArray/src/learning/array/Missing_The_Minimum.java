package learning.array;

//return the smallest missing positive integer.
import java.util.*;

class Minimum {
	public int firstMissingPositive(int[] nums,int k) {
        SortedSet<Integer> s=new TreeSet<>();
        List <Integer>s1= new ArrayList<>();
        for(int x:nums)s.add(x);
        for(int x:s)s1.add(x);
        return  s1.get(k-1);
	}
}

public class Missing_The_Minimum {

	public static void main(String[] args) {
		Minimum s = new Minimum();
		int a[] = { 3,2,1,5,6,4 };
		System.out.println(s.firstMissingPositive(a,2));
	}

}
