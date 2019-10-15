import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		
		String name = scnr.nextLine();
		
		System.out.println("Hello, " + name + "!");
		
		
		scnr.close();
	}

}
