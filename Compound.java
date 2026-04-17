import java.util.Scanner;
public class Compound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print(number);
        number += 2;

        System.out.println(" uptated to: " + number);
        number -= 5;

        System.out.println("How uptated to: " + number);
        input.close(); 

    }
}

//Напишите программу Compound.java. Ваша программа 
// должна выполнять следующие задачи: Запрашивать
//  у пользователя ввод числа; Прибавить к этому числу два, 
// используя составное присваивание (+=); Вывести результат 
// на экран; Вычесть 5 из числа, используя составное присваивание 
// (-=); Вывести результат на экран.