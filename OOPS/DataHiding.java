import java.util.*;
class Account {
    private double balance;
    
    public double getBalance(String username, String password , double balance){
        boolean result = validate(username,password);
        if(result){
            this.balance = this.balance - balance;
            return balance;
        }
        else{
            System.out.println("Invalid userame/password please try again");
            return 0.0;
        }
    }
    
    
    public void setBalance(String username, String password, double balance){
        boolean result = validate(username,password);
        if(result){
            this.balance = this.balance + balance;
            System.out.println("Credited to your account " + balance);
        }
        
        else{
            System.out.println("Invalid username/ password please try again");
        }
    }
    
    private boolean validate(String username, String password){
        return username.equalsIgnoreCase("laghvi") 
        && password.equals("laghvi123") ? true : false;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Account acc = new Account();
	    String username = sc.next();
	    String password = sc.next();
	    acc.setBalance(username,password,2000.00);
	    
	    double balance = acc.getBalance(username,password,500.00);
	    System.out.println("Withdrawn " + balance + " amount");
	}
}
