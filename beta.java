package test1;
import java.util.Scanner;

class inheritance{
	protected double balance = 20000;
	double interestR;
	double withdraw;
	int months;
	int pin;
	double loan;
	
	void Pin() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your pin: ");
		this.pin = input.nextInt();
		System.out.println("Welcome. your balance is: " + balance);
	}
	void withdrawal() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter withdrawal amount: ");
		this.withdraw = input.nextDouble();
		System.out.println("thank you. your current balance is: " + (balance - withdraw));
	}
}
class deposit extends inheritance{
	void depo() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter deposit amount: ");
		double deposit = input.nextDouble();
		System.out.println("thank you. your new balance is: " + (balance - withdraw + deposit));
	}
}
class interest extends deposit{
	void iR() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter interest rate: ");
		this.interestR = input.nextDouble();
		System.out.println("enter loan amount: ");
		this.loan = input.nextDouble();
		System.out.println("enter months to pay: ");
		this.months = input.nextInt();
		System.out.println("your total interest for " + months + " months is: " + ((loan * interestR) * months) + ".");
		System.out.println("your monthly payment for " + months + " months is: " + (((loan * interestR) * months) * months));
	}
}
class confirm extends interest{
	void option() {
		Scanner input = new Scanner(System.in);
		String option;
		System.out.println("would you like to proceed with the payment? Y or N: ");
		option = input.nextLine();
		System.out.println("thank you. your new balance is: " + (balance - (((loan * interestR) * months) * months)));
	}
}
public class beta {
	public static void main(String[] args) {
		confirm atm = new confirm();
		atm.Pin();
		atm.withdrawal();
		atm.depo();
		atm.iR();
		atm.option();
	}
}
