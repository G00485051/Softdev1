import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int seconds = 0;
         int minutes = 0;
         System.out.print("Enter minutes: ");
         minutes = input.nextInt();
         seconds = minutes * 60;
         for(int i = seconds; i >= 0; i--){
          System.out.print(i + " ");   
         }
         System.out.println();
         input.close();
    }
}


//Напишите программу Seconds.java, 
// которая запрашивает у пользователя ввод числа,
//  обозначающего минуты, и выводит обратный отсчет в секундах, 
// начиная с этого числа. Например, если пользователь вводит 1 минуту,
//  то выведите 60, 59, 58 и т.д., 3, 2, 1.
