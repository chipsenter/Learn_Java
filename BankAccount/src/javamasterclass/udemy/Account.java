package javamasterclass.udemy;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        // creating a default constructor
        this("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getnumber() { return number; }

    public void setnumber(String number) { this.number = number; }

    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }

    public String getCustomerName() { return customerName; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String  getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public void deposit(double depostAmount){
        this.balance += depostAmount;
        System.out.println("Deposit of $" + depostAmount + " made. New balance is $" + this.balance);
    }

    public void withdraw(double withdrawalAmount ){
        if(this.balance - withdrawalAmount <0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance $" + this.balance);
        }
    }
}
