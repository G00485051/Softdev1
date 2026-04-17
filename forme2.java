import java.util.Scanner;

public class forme2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0, result = 1;

        String output = "";
        int i = 1;

        while (i <= 5) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            output += number + " * ";
            result *= number;
            i++;

        }
        output = output.substring(0, output.length() - 3);
        System.out.println(output + " = " + result);

    }
}

//написать програму где пользователь введет 5 чисел и 
// в конце они умножаться друг на друга (х * х * х...= ответ)