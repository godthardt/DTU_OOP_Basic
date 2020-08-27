import java.util.Scanner;

public class RectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter length");
		Scanner scan = new Scanner(System.in);
		int bredde = scan.nextInt();
		System.out.println("Enter width");		
		int længde = scan.nextInt();
		System.out.println("Area is: " + (bredde*længde));
		scan.close();
		
	}

}
