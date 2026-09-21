class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance"
            );
        }

        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        double amount = 7000;

        try {
            b.withdraw(amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed");
            System.out.println("Amount: " + amount);
            System.out.println("Error: " + e.getMessage());
        }
    }
}
