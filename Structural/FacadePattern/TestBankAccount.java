public class TestBankAccount {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withdrawCash(50);
        accessingBank.withdrawCash(50);
        accessingBank.withdrawCash(50);
    }
    
}
