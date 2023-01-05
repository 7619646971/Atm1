package atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner scan=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'Rs'##,##,##0.00");
	HashMap<Integer , Integer> data=new HashMap<Integer , Integer>();
	
	public void getLogin() throws IOException {
		int x=1;
		do {
			try {
				data.put(1234, 6534);
				data.put(3455, 8836);
				System.out.println("Welcome to the ATM ");
				System.out.println("Enter the Account number ");
				setCustomerNumber(scan.nextInt());
				System.out.println("Enter the PIN ");
				setPinNumber(scan.nextInt());
			} catch (Exception e) {
				System.out.println(" ***Invalid input only numbers*** ");
				x=2;
			}
			
			if(x==1) {
				int cn=getCustomerNumber();
				int pn=getPinNumber();
				if(data.containsKey(cn)&&data.get(cn)==pn) {
					getAccountType();
				} else {
					System.out.println(" ## Wrong AcNumber ANd PIN ##  ");
				}
			}
		} while (x==1);
		
	}

	private void getAccountType() {
		System.out.println("Select the Account : ");
		System.out.println("type 1 - Cheking Account ");
		System.out.println("type 2 - Saving Account ");
		System.out.println("type 3 - Exit ");
		int selection = scan.nextInt();
		switch (selection) {
		case 1: getChecking();
				break;
		case 2: getSaving();
				break;
		case 3: System.out.println("Thank you for useing this ATM .");
				break;
		default: System.out.println("  Invalid choice.  ");
				getAccountType();
		}
	}

	private void getSaving() {
		System.out.println("Saving Account : ");
		System.out.println("type 1 - View Balence ");
		System.out.println("type 2 - Withdraw funds ");
		System.out.println("type 3 - Deposit Funds");
		System.out.println("type 4 - Exit ");
		int selection = scan.nextInt();
		switch (selection) {
		case 1: System.out.println("Checking Account Balence: "+moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2: getSavingWithdrawInput();
				getAccountType();
				break;
		case 3: getSavingDepositInput();
				getAccountType();
				break;
		case 4: System.out.println("Thank you for using this ATM ");
				break;

		default: System.out.println("  Invalid choice.  ");
				getChecking();
		}
		
	}

	private void getChecking() {
		System.out.println("Checking Account : ");
		System.out.println("type 1 - View Balence ");
		System.out.println("type 2 - Withdraw funds ");
		System.out.println("type 3 - Deposit Funds");
		System.out.println("type 4 - Exit ");
		int selection = scan.nextInt();
		switch (selection) {
		case 1: System.out.println("Checking Account Balence: "+moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2: getCheckingWithdrawInput();
				getAccountType();
				break;
		case 3: getCheckingDepositInput();
				getAccountType();
				break;
		case 4: System.out.println("Thank you for using this ATM ");
				break;

		default: System.out.println("  Invalid choice.  ");
				getChecking();
		}
		
	}
	
}
		
	

