

public class Customer {
	
	private int customerId;
	private String name;
	private String address;
	private Bank bank;
	
	public Customer() {
		System.out.println("Default constructor");
	}

	public Customer(int customerId, String name, String address, Bank bank) {
		this.customerId = customerId;
		this.name =  name;
		this.address = address;
		this.bank = bank;
	}
	
	void show(){  
	    System.out.println(customerId+" "+name+" "+address);  
	    System.out.println(bank.toString());  
	}
}
