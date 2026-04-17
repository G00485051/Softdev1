import java.util.Scanner;

public class ReadSetIntegers6w {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0, number = 0, even = 0, odd = 0;

        while ((choice == 1)) {
            System.out.print("Enter number: ");
            number = input.nextInt();
            if(number % 2 == 0){
                even += number;
            }else{
                odd += number;
            }
             System.out.print("Continue - enter 1 for yes: ");
             choice = input.nextInt();
        }
         System.out.println("Odd Total: " + odd);
          System.out.println("Even Total: " + even);
          input.close();
    }
}


//Напишите программу ReadSetIntegers.java, которая 
// считывает набор целых чисел, а затем выводит 
// сумму четных и нечетных чисел. Используйте для этого 
// упражнения цикл while с ограничителем. Пример вывода выглядит следующим образом.