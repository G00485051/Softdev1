package Assessment4;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);


        System.out.println("Part a:");
            System.out.println("------");

            for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 5; j++){ 
             System.out.print(" r" + i );
            System.out.print("c" + j);
            
           }
         System.out.println();
        } 
        System.out.println("Part b:");
            System.out.println("------");

            for(int i = 4; i >= 1; i--){
            for(int j = 5; j >= 1; j--){ 
             System.out.print(" r" + i );
            System.out.print("c" + j);
            
           }
         System.out.println();
        } 
    }

    }

 