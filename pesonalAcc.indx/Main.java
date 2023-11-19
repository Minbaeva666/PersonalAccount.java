public class Main {
    public static void main(String[] args) {

        Account account = new Account(1000);

        try {
            account.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
