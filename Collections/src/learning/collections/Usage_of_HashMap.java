package learning.collections;

//returning the minimum occuring integer
import java.util.*;
import java.util.Map.Entry;

class Solution {
	public int singleNumber(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		HashMap<Integer, Integer> s = new HashMap<>();
		for (int x : nums) {
			if (s.containsKey(x)) {
				s.put(x, s.get(x) + 1);
			} else {
				s.put(x, 1);
			}
		}
		int single = Collections.min(s.values());
		int result = 0;
		for (Entry<Integer, Integer> e : s.entrySet()) {
			if (e.getValue() == single) {
				result = e.getKey();
			}
		}
		return result;

	}

}

public class Usage_of_HashMap {
	public static void main(String[] args) {
		Solution s = new Solution();
		int a[] = { 1, 4, 4, 5, 6, 5, 6 };
		System.out.println(s.singleNumber(a));
	}
}