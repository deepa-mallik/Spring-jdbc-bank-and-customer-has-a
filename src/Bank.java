

public class Bank {
	
	private int accno;
	private String bankName;
	private String balance;
	
	
	public Bank(int accno, String bankName, String balance) {
		this.accno = accno;
		this.bankName = bankName;
		this.balance = balance;
	}
	
	public String toString(){  
	    return accno+" "+bankName+" "+balance;  
	}
}
