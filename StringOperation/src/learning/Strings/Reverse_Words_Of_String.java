package learning.Strings;

//spilt is a method that breaks a String according to some condition

class Solution2 {
	String reverseWords(String s) {
				String a = "";
		int l = 0, p = s.length();
		String[] split = s.split(" ");
		for (int i = (split.length - 1); i >= 0; i--) {
			if(!split[i].isEmpty()) {
			a = a + split[i];
			if (i != 0) {
				a += " ";
			}
			}
		}
		
		return a.trim();
	}
}

public class Reverse_Words_Of_String {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.reverseWords("   Hello   World  "));
	}

}
