interface ComputerColor{
	String color="Blue";
	void Chargedup();
}

public class interfacesexample2 implements ComputerColor{
	public static void main(String[] args) {
	System.out.println(color);
	interfacesexample2 ex=new interfacesexample2();
	ex.Chargedup();
	}

	@Override
	public void Chargedup() {
		// TODO Auto-generated method stub
		System.out.println("This computer is charged up");
	}
	


}
