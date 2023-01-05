package atm;

import java.text.DecimalFormat;
import java.util.Scanner;

class Account {
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'Rs'##,##,##0.00");
	int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	int getCustomerNumber() {
		return customerNumber;
	}
	int getPinNumber() {
		return pinNumber;
	}
	int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	double getCheckingBalance() {
		return checkingBalance;
	}
	double getSavingBalance() {
		return savingBalance;
	}
	double calcCheckingWithdraw(double amount) {
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
	}
	double calcSavingWithdraw(double amount) {
		savingBalance=(savingBalance-amount);
		return savingBalance;
	}
	double calcCheckingDeposit(double amount) {
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
	}
	double calcSavingDeposit(double amount) {
		savingBalance=(savingBalance+amount);
		return savingBalance;
	}
	void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance : "+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account : ");
		double amount = input.nextDouble();
		if((checkingBalance-amount)>=0&&amount>0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance : "+moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Insaficeant Balance ."+"\n");
		}
	}
	void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance : "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving Account : ");
		double amount = input.nextDouble();
		if((checkingBalance-amount)>=0&&amount>0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance : "+moneyFormat.format(savingBalance));
		} else {
			System.out.println("Insaficeant Balance ."+"\n");
		}
	}
	void getCheckingDepositInput() {
		System.out.println("Checking Account Balance : "+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Deposit to Checking Account : ");
		double amount = input.nextDouble();
		if(amount>0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance : "+moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Insaficeant Balance ."+"\n");
		}
	}
	void getSavingDepositInput() {
		System.out.println("Saving Account Balance : "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposit to Saving Account : ");
		double amount = input.nextDouble();
		if(amount>0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account Balance : "+moneyFormat.format(savingBalance));
		} else {
			System.out.println("Insaficeant Balance ."+"\n");
		}
	}
	
}


