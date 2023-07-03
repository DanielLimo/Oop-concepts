
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // initialize the class with Integer data
	    GenericsMethod demo = new GenericsMethod();

	    
	    demo.<String>genericMethod(" Java Programming");

	    
	    demo.<Integer>genericMethod(25);
	}

}
