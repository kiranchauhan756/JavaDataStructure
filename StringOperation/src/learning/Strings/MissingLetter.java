package learning.Strings;
//reduce method performs binary operation on two Varibales 
import java.util.stream.IntStream;

class Solution1 {
	public char findTheDifference(String s, String t) {

		return (char) (s + t).chars().reduce(0, (c, d) -> c ^ d);
	}
}

public class MissingLetter {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.findTheDifference("abcd", "abc"));
			}

}
