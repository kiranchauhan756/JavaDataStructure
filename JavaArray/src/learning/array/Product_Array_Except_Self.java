package learning.array;

import java.util.*;

class Solution22 {
	public List<Integer> product(int a[]) {
		Arrays.sort(a);

		List<Integer> s = new ArrayList<>();
		List<Integer> s1 = new ArrayList<>();

		for (int x : a)
			s.add(x);

		for (int i = a[0]; i < a[a.length - 1]; i++) {
			if ((!s.contains(i))) {
				s1.add(i);

			}
		}
		return s1;
	}
}

public class Product_Array_Except_Self {

	public static void main(String[] args) {
		Solution22 s = new Solution22();
		int a[] = { 1, 2, 5, 4 };
		System.out.println(s.product(a));

	}

}
