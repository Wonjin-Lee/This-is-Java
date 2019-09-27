package exercise;

public class Account {
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	void setBalance(int balance) {
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
	
	int getBalance() {
		return this.balance;
	}
}
