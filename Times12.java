import java.util.Scanner;

public class Times12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0, choice = 0, i = 1, max = 12;

        System.out.print("Enter number: ");
        number = input.nextInt();

        System.out.print("1. Add, 2 Mulitply: ");
        choice = input.nextInt();

        if(choice == 1 || choice == 2){
          while (i <= max) {
              if(choice == 1){
                 System.out.println(number + " + " + " i " + " = " + (i + number));}
              else{
                 System.out.println(number + " * " + " i " + " = " + (i * number)); }
             i++;  }
             
              }else{
                System.out.println("Invalid choice");}
    
    input.close();

   

        }
    }


//Напишите программу Times.java, которая 
// запрашивает у пользователя число, а затем спрашивает,
//  хочет ли он получить табличный результат для этого числа,
//  показывающий результаты умножения на все числа от 1 до 12 
// или сложения с всеми числами от 1 до 12. Пример выходных 
// данных этой программы выглядит следующим образом.