
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Getting Class_path and Operating system");
    String class_Path=System.getenv("CLASS_PATH");
    String operatingSystem=System.getenv("OS");
    System.out.println("Class Path-"+ class_Path);
    System.out.println(" Operating system-"+ operatingSystem);
    
	}

}
