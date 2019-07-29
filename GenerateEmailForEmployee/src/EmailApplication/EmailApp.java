package EmailApplication;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstname = sc.next();
		
		System.out.println("Enter last name: ");
		String lastname = sc.next();
		
		Email em1 = new Email(firstname,lastname);
		
		System.out.println(em1.showInfo());
	}

}
