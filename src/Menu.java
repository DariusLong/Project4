import java.util.Scanner;

public class Menu {

        private Bank bank = new Bank();
        private Scanner scanner = new Scanner(System.in);

        public void displayMenu() {
        bankChoice();
        //Chase chase = new Chase();
        //chase.bankLocations();
        while (true) {
            System.out.println("------Menu------\n\n");
            System.out.println("Select an Option:");
            System.out.println("1. Access Account\n" +
                    "2. Open a New Account\n" +
                    "3. Close All Accounts\n" +
                    "4. Exit");
            int optionOne = Integer.parseInt(scanner.nextLine());
            if (optionOne == 1) {
                accountAccess();
            }
            if (optionOne == 2) {
                newAccount();
            }
            if (optionOne == 3) {
                closeAllAccounts();
            }
            if (optionOne == 4) {
                break;
            } else {
                System.out.println("Invalid Entry");
            }
        }
    }
    public void bankChoice() {
        while (true) {
            System.out.println("------Bank Menu------\n\n");
            System.out.println("Select an Option:");
            System.out.println("1. Chase\n" +
                    "2. First Merchants\n" +
                    "3. Exit\n");
            int optionOne = Integer.parseInt(scanner.nextLine());
            if (optionOne == 1) {
                Chase chase = new Chase();
                chase.chase();
                chase.bankLocations();
                return;
            } else if (optionOne == 2) {
                FirstMerchants firstM = new FirstMerchants();
                firstM.firstMerchant();
                firstM.bankLocations();
                return;
            } else if (optionOne == 3) {
                System.out.println("exiting ...");
                return;
            }
           else{
            System.out.println("invalid");
        }
    }
    }
        public void accountAccess () {
        Customer customer;
        Account account;
        System.out.println("Enter in Pin");
        String pin = scanner.nextLine();
        customer = bank.getCustomer(pin);
        if (customer == null) {
            System.out.println("PIN is not valid");
            return;
        }
        System.out.println("Active Accounts");
        System.out.println(customer.getAllAccounts());
        System.out.println("Enter in account number\n");
        int accountNo = Integer.parseInt(scanner.nextLine());
        account = customer.getAccount(accountNo);
        if (account == null) {
            System.out.println("Account number is invalid");
            return;
        }
        accountMenu(account, customer);


    }
        public void newAccount () {
        Customer customer;
        Account account;
        System.out.println("Are you a new customer? Yes or No");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            customer = createNewCustomer();
        } else {
            System.out.println("Enter in pin");
            String pin = scanner.nextLine();
            customer = bank.getCustomer(pin);
            if (customer == null) {
                System.out.println("Invalid Pin");
                return;
            }
            //prompt user for intial deposi
        }
        System.out.println("Enter in your initial deposit");
        double initialDeposit = Integer.parseInt(scanner.nextLine());
        account = new Account(initialDeposit);
        customer.addAccount(account);
        System.out.println("New Account Open" + account.getAccountNumber());
    }

        public Customer createNewCustomer () {
        String firstName;
        String lastName;
        String pin;
        Customer customer;
        System.out.println("Enter in First Name");
        firstName = scanner.nextLine();
        System.out.println("Enter in Last Name");
        lastName = scanner.nextLine();
        System.out.println("Enter in a Pin");
        pin = scanner.nextLine();
        customer = new Customer(firstName, lastName, pin);
        bank.addCustomer(customer);
        return customer;

    }
        public void closeAllAccounts () {
        String pin;
        Customer customer;
        System.out.println("Enter in PIN");
        pin = scanner.nextLine();
        customer = bank.getCustomer(pin);
        if (customer == null) {
            return;
        }
        bank.removeCustomer(customer);
        System.out.println("Customer has been removed from bank registry");
    }
        public void accountMenu (Account account, Customer customer){
        while (true) {
            System.out.println("Please make a selection:\n" +
                    "1. Make a deposit\n" +
                    "2. Make a withdrawal\n" +
                    "3. See account balance\n" +
                    "4. Close account\n" +
                    "5. Exit");
            int optionTwo = Integer.parseInt(scanner.nextLine());
            if (optionTwo == 1) {
                System.out.println("How much money do you want to deposit?");
                double deposit = Integer.parseInt(scanner.nextLine());
                account.deposit(deposit);
            } else if (optionTwo == 2) {
                System.out.println("How much money do you want to withdraw?");
                double withdraw = Integer.parseInt(scanner.nextLine());
                account.withdraw(withdraw);
            } else if (optionTwo == 3) {
                account.seeAccountBalance();
            } else if (optionTwo == 4) {
                int acn = account.getAccountNumber();
                customer.removeAccount(account);
                System.out.println("Account Number has been removed" + acn);
            } else if (optionTwo == 5) {
                break;
            } else {
                System.out.println("Invalid Entry");
            }
        }
    }
    }

