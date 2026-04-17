//Создать программы (использовать по очереди все циклы), она 
// должна показывать 10 чисел начиная с того которое введет пользователь

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = 0;

        System.out.print("Enter number: ");     
        num = input.nextInt();

        for(int i = num; i < num + 10; i++){
      System.out.println(i);
    }
  }
}
