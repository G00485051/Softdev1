//Напишите программу FifthLoop.java, которая запрашивает 
// у пользователя значение и использует это значение для 
// определения количества выполнений кода внутри цикла while. 
// Пример выходных данных выглядит следующим образом.

import java.util.Scanner;

public class FifthLoop {
    public static void main(String[] args) {
        int x = 1, number = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a counter value: ");
        number = input.nextInt();

        while (x <= number) {
            System.out.println("Loop counter: " + x);
        x++;
        }
        input.close();
    }
}
