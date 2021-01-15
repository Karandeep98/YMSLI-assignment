import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = scanner.next();
		System.out.println("Enter 1 for saving account and 2 for current account:");
		int type = scanner.nextInt();
		if (type == 1) {
			SavingAccount savingAccount = new SavingAccount(name);
			savingAccount.setMax_withdraw_limit(100000);
			while (true) {
				System.out.println("Enter 1 to deposit money\n" + "Enter 2 to withdraw money\n"
						+ "Enter 3 to show balance\n" + "Enter 0 to exit");
				int choice = scanner.nextInt();
				double amount;
				switch (choice) {
				case 1:
					System.out.println("Enter amount:");
					amount = scanner.nextDouble();
					System.out.println("Do you want to know your current balance? Press 1 for YES and 0 for NO");
					int option = scanner.nextInt();
					if (option == 1) {
						System.out.println("Current Balance:" + savingAccount.getAccount_balance());
					}
					savingAccount.deposit(amount);
					System.out.println("Balance after deposit:" + savingAccount.getBalance());
					break;
				case 2:
					System.out.println("Enter amount:");
					amount = scanner.nextDouble();
					System.out.println("Balance before withdrawal:" + savingAccount.getBalance());
					savingAccount.withdraw(amount);
					System.out.println("Balance after withdrawal:" + savingAccount.getBalance());
					break;
				case 3:
					System.out.println("Current Balance:" + savingAccount.getBalanceWithInterest());
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Invalid choice!!");
				}
			}
		} else if (type == 2) {
			System.out.println("Enter trade license number:");
			String trade_license_number = scanner.next();
			CurrentAccount currentAccount = new CurrentAccount(name,trade_license_number);
			while (true) {
				double amount;
				System.out.println("Enter 1 to deposit money\n" + "Enter 2 to withdraw money\n"
						+ "Enter 3 to show balance\n" + "Enter 0 to exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter amount:");
					amount = scanner.nextDouble();
					System.out.println("Do you want to know your current balance? Press 1 for YES and 0 for NO");
					int option = scanner.nextInt();
					if (option == 1) {
						System.out.println("Current Balance:" + currentAccount.getAccount_balance());
					}
					currentAccount.deposit(amount);
					System.out.println("Balance after deposit:" + currentAccount.getBalance());
					break;
				case 2:
					System.out.println("Enter amount:");
					amount = scanner.nextDouble();
					System.out.println("Balance before withdrawal:" + currentAccount.getBalance());
					currentAccount.withdraw(amount);
					System.out.println("Balance after withdrawal:" + currentAccount.getBalance());
					break;
				case 3:
					System.out.println("Current Balance:" + currentAccount.getBalance());
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Invalid choice!!");
				}
			}
		}

	}
}
