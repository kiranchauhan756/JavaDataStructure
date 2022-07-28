package learningThisKeyword;

class Main1{
	int  sum(int a,int b) {
		return a+b;
	}
	int avr() {
		return (this.sum(20, 50))/2;
		
	}
}
public class Invoke_Current_class_Method {

	public static void main(String[] args) {
		Main1 s=new Main1();
		System.out.println(s.avr());

	}

}
