public class BankAccountFacade {

    private int accountNumber;

    private int securityCode;

    WelcomeToBank bankWelcome;
    AccountNumberCheck accountChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;

    public BankAccountFacade(int newAccountNumber, int newSecurityCode) {
        accountNumber = newAccountNumber;
        securityCode = newSecurityCode;

        bankWelcome = new WelcomeToBank();
        accountChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (accountChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction complete");
        } else {
            System.out.println("Transaction failed");
        }

    }
}
