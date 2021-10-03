import java.awt.desktop.SystemSleepListener;
import java.util.ArrayList;
import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        String myName = "\t\t\tUsaid Ahmed";
        System.out.println(myName);

        int integerOne= 5;
        int integerTwo= 3;
        int integerThree= 11;

        float meanAnswer = (float) (integerOne + integerTwo + integerThree) / 3;
        System.out.println(meanAnswer);

        System.out.println("Give me a day of the week: ");
        Scanner dayOfWeek = new Scanner(System.in);
        String daySelected = dayOfWeek.next();
        System.out.println("\nHappy "+daySelected+"!");

        System.out.println("enter a word: ");
        Scanner userSelection = new Scanner(System.in);
        String selectedWord = userSelection.next();
        System.out.println(selectedWord.substring(selectedWord.length()-1)); //

        Account user1 = new Account(1122,20000,4.5);


        System.out.println("\nAccount ID:" + user1.getId() + "\nAccount Balance: " + user1.getBalance() +"\nAnnual interest rate: " + user1.getAnnualInterestRate() );

        System.out.println("\nWithdrawal amount: ");
        Scanner userWithdrawalAmount = new Scanner(System.in);
        double withdrawalAmount = userWithdrawalAmount.nextDouble();

        user1.withdraw(withdrawalAmount);
        System.out.println("\n your balance is: " + user1.getBalance() + "\nDeposit amount: ");
        Scanner userDepositAmount = new Scanner(System.in);
        double depositAmount = userDepositAmount.nextDouble();

        user1.deposit(depositAmount);
        System.out.println("\n Your balance: " + user1.getBalance());
        System.out.println("\n Date created: "+user1.getDateCreated());






/* come back to this
        ArrayList<String> wordArray = new ArrayList<String>();
        wordArray.add(selectedWord);
*/



    }

}
