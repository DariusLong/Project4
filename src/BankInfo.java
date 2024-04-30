import java.util.Scanner;

public class BankInfo {
        Scanner scanner = new Scanner(System.in);

        /*public void bankNAme() {
            String bankName;
            System.out.println("What is the name of your bank");
            bankName = scanner.nextLine();
            System.out.println("***** " + bankName + " *****");
        }*/
        public void bankLocations(){
            String location;
            System.out.println("Where is your bank located");
            location = scanner.nextLine();
            System.out.println("***** " + location + " *****");

        }

}
