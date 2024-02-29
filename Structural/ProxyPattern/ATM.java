public class ATM implements AccountService {
	
	private AccountService bankAccount;
	
	public ATM() {
		this.bankAccount = new BankAccount();
	}

	@Override
	public void withdrawMoney() {
		otherMehtodsInsideProxy();
		bankAccount.withdrawMoney();
	}
	
	@Override
	public void getAccountBalance() {
		
	}
	
	public void otherMehtodsInsideProxy() {
		System.out.println("other methods doing work...");
	}
}