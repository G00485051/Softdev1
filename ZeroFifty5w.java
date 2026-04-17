import java.util.Scanner;
public class ZeroFifty5w {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        do{
            System.out.print("Enter number between 1 and 50: ");
            number = input.nextInt();
        }while(number > 0 && number < 50);
        System.out.println("End");
        input.close();
    }
}


//Напишите программу ZeroFifty.java, которая использует цикл
//  do while для запроса числа от 0 до 50. Если введено число, 
// выходящее за пределы этого диапазона, программа завершается. 
// Пример вывода из этой программы выглядит следующим образом.