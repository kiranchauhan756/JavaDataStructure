package learning.array;

//Reversing a Single Dimension Array
class Solution1{
	void revArr(int []a) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
public class Reverse_Array {

	public static void main(String[] args) {
		int a[]= {20,23,17,52,90,44,87};
		Solution1 s=new Solution1();
		s.revArr(a);
	}

}
