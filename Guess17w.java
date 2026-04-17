import java.util.Scanner;

public class Guess17w {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 5, guess = 0, count = 0;
        do{
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            count++;
        }while(number != guess);

        System.out.print("Correct. Number is " + number + ". It took you " + count + " attempts");
    }
}
