package EmailApplication;

import java.util.Scanner;

public class Email {
private String firstname;
private String lastname;
private String password;
private String department;
private String alternateEmail;
private String email;
private String companySuffix = "aeycompany.com";
private int mailboxCapacity = 500;
private int defaultpasswordlength = 10;

//Constructor to receive the first name and the last name
public Email(String firstname, String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;
	
	
	//write a method to ask for department and return the department
	this.department = setDepartment();
	
	
	// call a method that returns a random password
	this.password = randomPassword(defaultpasswordlength);
	System.out.println("\nYour new password is " + this.password);
	
	//combine elements to generate email
	email = firstname.toLowerCase()+"."+ lastname.toLowerCase()+"@"+department+"." + companySuffix;

}

//to ask the department
private String setDepartment() {
	System.out.print("New Worker:"+firstname+"\nDepartment Codes\n1 for Sales\n2 for development\n3 for acounting\n4 for none\n\nEnter a department: ");
	Scanner in = new Scanner(System.in);
	int depChoice = in.nextInt();
	if(depChoice == 1) {return "Sales";}
	else if (depChoice ==2) {return "development";}
	else if (depChoice ==3) {return "accounts";}
	else {return "none";}
}

//generate a random password
private String randomPassword(int length) {
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@!#$&";
	char[] password = new char[length];
	for(int i=0; i<length; i++) {
		int rand = (int)(Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
	}
	return new String(password);
}

//set the mailbox capacity
public void setmailboxcapacity( int capacity) {
	this.mailboxCapacity = capacity;
}
//set the alternate email
public void setalternateemail( String altemail) {
	this.alternateEmail = altemail;
}

//change the password
public void changepassword(String password) {
	this.password = password;
}

public int getmailboxcapacity() {return mailboxCapacity;}
public String getalternateemail() {return alternateEmail;}
public String getpassword() {return password;}

public String showInfo() {
	return "NAME: " +firstname+" "+lastname+
			"\nCOMPANY EMAIL: "+email+
			"\nMAILBOX CAPACITY: "+mailboxCapacity;
}

}
