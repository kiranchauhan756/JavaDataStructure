package learning.array;

class Solution2{
	void countFreq(int a[]) {
	char nptel[]= {'S','W','A','Y','A','M'};
	System.out.println(""+nptel[nptel.length-2]+nptel[0]);
	System.out.println(""+nptel[0]+nptel[nptel.length-2]);
	}
}
public class Count_Freq_of_Each_Ele {

	public static void main(String[] args) {
		int a[]= {1,1,6,9,2,2,2,4,9,1,0};
		 Solution2 s=new Solution2();
		 s.countFreq(a);

	}

}
