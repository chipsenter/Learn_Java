package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {
	    //Account johansAccount = new Account("111111", 100, "John Johns", "john@johnjohns.com","720.234.1111" );
		Account johansAccount = new Account(); // default constructor will be called
	    System.out.println(johansAccount.getEmail());
		System.out.println(johansAccount.getCustomerName());
		System.out.println(johansAccount.getBalance());
//	    johansAccount.withdraw(100.00);
//	    johansAccount.setnumber("111111");
//	    johansAccount.setCustomerName("John Johns");
//	    johansAccount.setEmail("john@johnjohns.com");

	    johansAccount.deposit(50.0);
	    johansAccount.withdraw(100.00);

	    johansAccount.deposit(51.00);
		johansAccount.withdraw(100.00);
		johansAccount.deposit(100.00);
    }
}
