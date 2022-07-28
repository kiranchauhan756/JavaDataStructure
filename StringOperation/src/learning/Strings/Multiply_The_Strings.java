package learning.Strings;

import java.math.BigInteger;

class Solution3 {
    public String multiply(String num1, String num2) {
    	 BigInteger n=new BigInteger(num1);
    	    BigInteger k=new BigInteger(num2);
    	    n=n.multiply(k);
    	    return n.toString();
    }
}
public class Multiply_The_Strings {

	public static void main(String[] args) {
		Solution3 s=new Solution3();
		System.out.println(s.multiply("123456789","987654321"));
	}

}
