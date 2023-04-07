public class FundsCheck {

    private double cashInAccount = 100;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public boolean haveEnoughMoney(double cashToWithdraw) {
        if (cashToWithdraw > getCashInAccount()) {
            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrawn Complete: Current Balance is: " + getCashInAccount());
            return true;
        }
    }
}
