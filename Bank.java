public class Bank {

    public static String bankName = "Bank of India";

    public static void displayBankInfo() {
        System.out.println("Bank Name        :" +bankName);
    }

   public String branchName;
   public  String branchLocation;

    public Bank(String branchName, String branchLocation) {
    this.branchName = branchName;
    this.branchLocation = branchLocation;
    }

    public void displayBranchInfo() {
        System.out.println("Branch Name      :" +branchName);
        System.out.println("Branch Location  :" +branchLocation);
    }

    public class Customer {
     public String customerName;
     public String accountNumber;
     public double accountBalance;
    
     
     public Customer(String customerName, String accountNumber, double accountBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
     }
     public void displayCustomerInfo() {
        System.out.println("Customer Name    :" +customerName);
        System.out.println("Account Number   :" +accountNumber);
        System.out.println("Account Balance  :" +accountBalance);

     }
    }

    public static void main(String[] args) {

        Bank.displayBankInfo();

        Bank branch1 = new Bank("Main Branch", "New Delhi");
        Bank branch2 = new Bank("Sub Branch"  , "Hyderabad");
    
        branch1.displayBranchInfo();
        branch2.displayBranchInfo();

        Bank.Customer customer1 = branch1.new Customer("Arun", "9573710",99999.999);
        Bank.Customer customer2 = branch2.new Customer("Tharun", "762738",19983.542);

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
    }
}
 

