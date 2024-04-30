import java.util.ArrayList;
import java.util.LinkedList;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private LinkedList<Account> accountLinkedList = new LinkedList<>();

    public Customer(String firstName, String lastName, String pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPin(){
        return pin;
    }
    public LinkedList<Account> getAccountLinkedList(){
        return accountLinkedList;
    }
    public String getAllAccounts(){
        String allAccounts = "";
        for(Account account: accountLinkedList){
            allAccounts += account.toString()+"\n";
        }
        return allAccounts;

    }
    public void addAccount(Account account){
        accountLinkedList.add(account);
    }
    public void removeAccount(Account account){
        accountLinkedList.remove(account);
    }
    public Account getAccount(int accountNumber){
        Account foundAccount = null;
        for(Account account: accountLinkedList){
            if(account.getAccountNumber() == accountNumber){
                foundAccount = account;
                break;
            }
        }
        return foundAccount;
    }
    @Override
    public String toString() {
        return String.format("Name: %s %s\n" +
                        "Pin: %d\n\n",
                firstName, lastName, pin);
    }

}
