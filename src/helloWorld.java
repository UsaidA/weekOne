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
/* come back to this
        ArrayList<String> wordArray = new ArrayList<String>();
        wordArray.add(selectedWord);
*/


    }

}
