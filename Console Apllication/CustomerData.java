package BankingApplication;

public class CustomerData {
	
	private String customerName;
	private int accountNumber;
	private int password;
	private double minimumBalance;
	private long contact;
	private String city;
	
	static int accNo=12120;
	public CustomerData(String name, int password, double minBal, long contact, String city){
		accNo++;
		this.customerName=name;
		this.accountNumber=accNo;
		this.password=password;
		this.minimumBalance=minBal;
		this.contact=contact;
		this.city=city;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getPassword() {
		return password;
	}
	public long getContact() {
		return contact;
	}
	public String getCity() {
		return city;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public static int getAccNo() {
		return accNo;
	}
}