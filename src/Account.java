import java.util.Date; // Took some inspiration from the solution for this task 5 (creating this class)
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date  dateCreated;


    Account() {
        id = 0;
        balance = 0.00;
        annualInterestRate = 0.00;
        dateCreated = new Date();

}
Account(int newId, double newBalance, double newAnnualInterestRate){
        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnualInterestRate;
        dateCreated = new Date();
}
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public void setId(int newId){
        id = newId;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
    public int getId(){
        return id;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public String getDateCreated(){
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return balance *(getMonthlyInterestRate()/100);

    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public double getBalance(){
        return balance;
    }

}


