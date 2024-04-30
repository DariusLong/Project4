import java.util.Scanner;

public class Account {
    Scanner scanner = new Scanner(System.in);
    private double accountBalance;
    private int accountNumber;
    static private int numberOfAccounts = 1000;
    /* public void Account(double accountBalance, int accountNumber, int numberOfAccounts){
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.numberOfAccounts = numberOfAccounts;
    }

     */

    public Account(double initialDeposit){
        this.accountBalance = initialDeposit;
        this.accountNumber = numberOfAccounts++;

    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double initialDeposit) {
        //System.out.println("How much money do you want to deposit?");
        //double deposit = Integer.parseInt(scanner.nextLine());
        accountBalance += initialDeposit;
        System.out.println("Deposit Amount: $" + initialDeposit);
        System.out.println("Account Balance: $" + accountBalance);
    }
    public void withdraw(double withdraw){
        //System.out.println("How much money do you want to withdraw?");
        //double withdraw = Integer.parseInt(scanner.nextLine());
        if(withdraw > accountBalance || withdraw <= accountBalance){
            System.out.println("Insufficient Funds");
            accountBalance = accountBalance - withdraw;
            System.out.println("Account Balance: $" + accountBalance);
        }
        else{
            accountBalance = accountBalance - withdraw;
            System.out.println("Account Balance: $" + accountBalance);
            System.out.println("Amount withdraw" + withdraw);
        }
    }
    public void seeAccountBalance(){
        System.out.print("Account Number" + accountNumber);
        System.out.print("Account Balance" + accountBalance);
    }
    public double getDeposit() {
        return accountBalance;
    }
    public String toString() {
        return String.format("Account Number: %d\nAccount Balance: %.2f\n", accountNumber, accountBalance);
    }
}
