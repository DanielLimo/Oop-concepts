 class Car{
	 public void Rev(){
		 System.out.println(" Vrooom vroom vroom");
	 }
 }
 class Mazda extends Car {
	 public void Rev(){
		 System.out.println(" Beeep Beep Beep");
	 }
	 
	 
 }
 
 public class PolymorphismExample{
	 
	 public static void main(String[] args) {
		 Mazda b= new Mazda();
		 b.Rev();
	 }
	 
 }
	 