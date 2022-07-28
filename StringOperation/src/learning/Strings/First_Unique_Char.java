package learning.Strings;

class Solution4 {
    public int firstUniqChar(String s) {
    	int value=0;
        char m[]=s.toCharArray();
        for(int i=0;i<m.length;i++) {
        	for(int j=1;j<m.length;j++) {
        		if(m[i]==m[j]) {
        			value++;
        		}
        			
        	}
        }
        return ;
    }
}
public class First_Unique_Char {

	public static void main(String[] args) {
		Solution4 s=new Solution4();
		System.out.println(s.firstUniqChar("loveleetcode"));
	}

}
