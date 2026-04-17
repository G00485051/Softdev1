package Assessment4;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = -1, number = 0;

        while (number > 0) {
            total++;
            System.out.print("Enter a number (less then 0 to quit): ");
            number = input.nextInt();
        }
        System.out.println("You entered " + total + " positive numbers. ");
        number = 0;
        total = 0;
      
       
        input.close();
    }
}
