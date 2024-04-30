import java.util.ArrayList;
import java.util.LinkedList;

public class Bank {
    private LinkedList<Customer> customerLinkedList = new LinkedList<>();

    public void addCustomer(Customer customer){
        customerLinkedList.add(customer);
    }
    public void removeCustomer(Customer customer){
        customerLinkedList.remove(customer);
    }
    public LinkedList<Customer> getCustomerArrayList(){
        return customerLinkedList;
    }
    public String getAllCustomers(){
        String allCustomers = "";
        for(Customer customer: customerLinkedList){
            allCustomers += customer.toString()+"\n";
        }
        return allCustomers;

    }
    public Customer getCustomer(String pin){
        Customer foundCustomer = null;
        for(Customer customer: customerLinkedList){
            if(customer.getPin().equals(pin)){
                foundCustomer = customer;
                break;
            }
        }
        return foundCustomer;
    }
}
