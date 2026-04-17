package Assessment4;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String q = " ";
        System.out.print("Enter text: ");
        q = input.nextLine();
        
        for(int i = 1; i <= 11; i++){
            System.out.println(i + ". " + q);
    
           }
         

    }
}
