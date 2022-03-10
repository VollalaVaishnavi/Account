package com.synchronization;
import java.util.Scanner;
class Account {
	
	public int balance;
	public int accountNo;
	void displayBalance() {
		System.out.println("Account No: "+ accountNo +" Balance: " + balance);
	}
	synchronized void deposit(int amount) {
		balance=balance+amount;
		System.out.println(amount +" is deposited");
		displayBalance();
	}
synchronized void withdraw(int amount) {
	balance=balance-amount;
	System.out.println(amount+ " is withdrawn");
	displayBalance();
	
}
}
//Account class closed
class TransactionDeposit implements Runnable{
	int amount;
Account accountX;
	TransactionDeposit(Account x,int amount){
		accountX=x;
		this.amount=amount;
		new Thread(this).start();
	}
	public void run() {
		accountX.deposit(amount);
	}
}
class TransactionWithdraw implements Runnable{
	int amount;
	Account accountY;
	TransactionWithdraw(Account y,int amount){
		accountY=y;
		this.amount=amount;
		new Thread(this).start();
	}
	public void run() {
		accountY.withdraw(amount);
	
	}	
}
public class BankSync{
	public  static void main(String[] args) {
		Account ABC=new Account();
		ABC.balance=1000;
		ABC.accountNo=111;
		Scanner scanner=new Scanner(System.in);
		int damount=200;
		TransactionDeposit t1;
		TransactionWithdraw t2;
		t1=new TransactionDeposit(ABC,damount);
		t2=new TransactionWithdraw(ABC,damount );
		
	}
			 
	}

	

	 


