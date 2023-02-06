package Day11_12;

public class Account {


    private double balance;

    public Account() {

    }

    public void deposit(double depositAmount)

    public Account(double initialBalance) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
        else
            System.out.println("Deposit amount is not valid.");

        if (initialBalance > 0.0)
            balance = initialBalance;
    }

    public void withdraw(double withdrawAmount)

    public void credit(double amount) {
        if (withdrawAmount <= balance)
            balance = balance - withdrawAmount;
        else
            System.out.println("Withdrawal amount exceeded account balance.");
        balance = balance + amount;
    }

    public void debit(double debitAmount) {

        public double getBalance () {

            return balance;

            if (debitAmount > balance) {
                debitAmount = 0.0;
                System.out.println("Debit amount exceeded account balance.");
            }
            balance = balance - debitAmount;
        }

        public static void main (String[]args){
            Account a = new Account();
            a.deposit(1000);
            a.withdraw(5000);
            System.out.println(a.balance);
            public double getBalance ()
            {
                return balance;
            }

        }
    }
}