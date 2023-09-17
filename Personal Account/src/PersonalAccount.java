import java.util.ArrayList;
public class PersonalAccount {
    int accountNumber;
    String accountHolder;
    double balance;
    ArrayList<Amount> transactions = new ArrayList<Amount>();

    public PersonalAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    /**
     * In this function "deposit" we can add money to our balance and record it in history of transactions
     * ans also update account balance
     *
     * @param amount amount of our deposit
     */
    void deposit(double amount){
        Amount temp = new Amount(amount, "Deposit");
        balance += amount;
        transactions.add(temp);
    }

    /**
     * In this method we can withdraw money from our bank account, and if it's not enough we get a message -
     * "Your amount is more than your balance!
     *
     * @param amount also amount of our withdraw
     */
    void withdraw(double amount){
        Amount temp = new Amount(amount, "Withdrawal");
        if(balance < amount){
            System.out.println("Your amount is more than your balance!");
        }else{
            balance -= amount;
        }
        transactions.add(temp);
    }

    /**
     * This method is responsible for printing a hole transaction history, including transaction type and history
     */
    void printTransactionHistory(){
        for(Amount i : transactions){
            System.out.println(i);
        }
    }

    /**
     * A method to retrieve the current balance of the account.
     */
    void getBalance(){
        System.out.println(balance);
    }

    /**
     * A method to retrieve the account number.
     */
    void getAccountNumber(){
        System.out.println(accountNumber);
    }

    /**
     *  A method to retrieve the account holder's name.
     */
    void getAccountHolder(){
        System.out.println(accountHolder);
    }
}