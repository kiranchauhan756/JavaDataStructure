package learning.numbers;

class Fibonacci{
	void print(int num) {
		int f=0,g=1;
		for(int i=1;i<=num;i++) {
			System.out.print(f+" ");
			f=f+g;
			g=f-g;
		}
	}
}
public class FibonacciSeries {

	public static void main(String[] args) {
		Fibonacci s=new Fibonacci();
		s.print(10);
	}

}
