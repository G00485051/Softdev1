package Assessment1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first,second;

        System.out.print("Enter first number: ");
        first = input.nextInt();

        System.out.print("Enter second number: ");
        second = input.nextInt();

        System.out.println("( " + first + " + " + second + " ) * 4 = " + ((first+second)*4) );
        input.close();
    }
}




//Напишите программу под названием Exercise2.java, которая 
// выполняет следующее: a. Запрашивает у пользователя ввод 
// двух чисел. b. Выводит на экран результат сложения двух
//  чисел и умножения полученного результата на 4. См.
//  скриншот ниже для примера вывода этой программы.
