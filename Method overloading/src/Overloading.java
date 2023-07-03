
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int results1=	addNumbers(10,30);
		double  results2=	addNumbers(10.5,30.555);
		
		System.out.println(results1);
		System.out.println(results2);
	}

	public static int addNumbers(int a ,int b) {
		return a+b;
	}
	public static double addNumbers(double a ,double b) {
		return a+b;
	}
}
