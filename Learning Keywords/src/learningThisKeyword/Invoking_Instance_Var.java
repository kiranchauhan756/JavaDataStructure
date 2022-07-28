package learningThisKeyword;

class Main{
	int c;

	Main(int c, int n) {
		this.c = c + n;
		
	}
    
    
    
	int avg() {
		
		return (c / 2);
	}
		
	
}
public class Invoking_Instance_Var {

	public static void main(String[] args) {
		Main s = new Main(50, 30);
		System.out.println(s.avg());

		
	}

}
