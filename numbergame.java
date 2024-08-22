import java.util.Scanner;
import java.util.Random;

public class numbergame {
    public static void main(String[] args) {
        Random computerguess = new Random();
        int numberguess =computerguess.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        while (true) {
            System.out.print("enter your guess (1-100): ");
            int userguess = sc.nextInt();
            attempts++;

            if(userguess == numberguess)
            {
                System.out.println("congratulations! you guessed the correct number");
                System.out.println("your score : "+attempts+ " attempts");
            }
            else if (userguess < numberguess) {
                System.out.println("too low!");
            }
            else
            {
                System.out.println("too high!");
            }
        }
    }    
}
