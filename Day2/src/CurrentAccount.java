
public class CurrentAccount extends Account {
	private String tradeLicenseNumber;

	public CurrentAccount(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String name, String tradeLicenseNumber) {
		super(name);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}

	public String getTradeLicenseNumber() {
		return tradeLicenseNumber;
	}

	public void setTradeLicenseNumber(String tradeLicenseNumber) {
		this.tradeLicenseNumber = tradeLicenseNumber;
	}

	public double getBalance() {
		return getAccount_balance();
	}

	public void withdraw(double amount) {
		if (amount > getAccount_balance()) {
			System.out.println("Insufficient Balance!");
		} else {
			setAccount_balance(getAccount_balance() - amount);
		}
	}

}
