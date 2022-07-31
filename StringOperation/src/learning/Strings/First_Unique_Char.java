package learning.Strings;

import java.util.Scanner;

class Solution4 {
	int age;
	String name;
	Scanner sc=new Scanner(System.in);
    public void firstUniqChar() {
    	System.out.println("Enter the details");
    	age=sc.nextInt();
    	name=sc.next();
    }
    void show() {
    	System.out.println(age);
    	System.out.println(name);
    }
}
public class First_Unique_Char {

	public static void main(String[] args) {
		Solution4 s=new Solution4();
	     
		s.firstUniqChar();
		s.show();
	}

}
