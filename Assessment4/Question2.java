package Assessment4;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 4, number = 0;
        String q = "Quaestion 2";
      

        System.out.print("Enter number: ");
        number = input.nextInt();

        if(number <4 ){
            max = 2;
        }

        for(int i = 1; i <= max; i++){ 
                
            
            System.out.println(i + ". " + q);
           } 
             
       
        System.out.println();
    }
    }


