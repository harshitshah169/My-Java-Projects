import java.util.Scanner;

public class SwapNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two digit number to be swaped: ");
		int a = sc.nextInt();
		if(a>99) {
			System.out.println("Invalid number");
		}
		int rem = a%10;
		int div = a/10;
		
		System.out.println("Number after swapping is "+rem+""+div);
	}
}
