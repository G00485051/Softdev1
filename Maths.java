import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, choice;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Choise arithmetik option: ");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Miltiplication");
        System.out.println("4. Division");
        System.out.println("Choise");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case 2:
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case 3:
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case 4:
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;

            default:
                System.out.println("Invalid choise");      
        }
    }
}


//Напишите программу Maths.java, которая запрашивает у пользователя ввод
//  двух чисел, а затем предлагает выбрать арифметическую операцию для 
// выполнения над этими двумя числами. Вывод должен быть похож на примеры, показанные ниже.