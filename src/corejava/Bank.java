package corejava;

public class Bank {
	
	int totalamount;
	static int withdrawl=500;

	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.deposit(1000);

		Bank bank1=new Bank();
		bank1.deposit(2000);
		System.out.println("amount debitted is"+withdrawl);
		System.out.println("thank u come again");
		
	
	
		
		
		
		// TODO Auto-generated method stub

	}
	void deposit(int amount) {
	totalamount=totalamount+amount;
	System.out.println("hiii user welcome to ICICI bank");
	System.out.println("amount deposited is"+amount);
}
int withdrawl(int amount) {
totalamount=totalamount-amount;
int withdrawl=amount;
System.out.println("balance amount"+totalamount);
return withdrawl;
}




}
