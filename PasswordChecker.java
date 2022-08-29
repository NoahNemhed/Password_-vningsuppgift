import java.util.Random;
import java.util.Scanner;

public class PasswordChecker {

    String password;

    public PasswordChecker(String password) {
        this.password = password;
    }

    public void login(){
        Scanner sc = new Scanner(System.in);

        int guesses = 3;

        while(guesses > 0){
            System.out.println("Enter password.");
            String s = sc.next();

            if(s.equals(this.password)){
                System.out.println("Correct password.");
                guesses = 0;
            }else{
                guesses--;
                System.out.println("Wrong password. " + "\n" +
                                   guesses + " left.");
            }
        }







    }

}
