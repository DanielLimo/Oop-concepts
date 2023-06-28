abstract class Car{
	public void Hoot() {
		System.out.println(" Beep!! Beep!!");
	}
	
}
class Mazda extends Car{}

public class abstractionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Mazda m=new Mazda();
    m.Hoot();
	}

}
