import java.util.Scanner;

public class Sum5w {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, total = 0, digit = 0;
        String output = "";
        String reverse = "";


        System.out.print("Enter a number: ");
        number = input.nextInt();

        while ((number > 0)) {
            digit = number % 10;
            total += digit;
            number /= 10;
            output += digit + " + ";
        }
        System.out.println("Total " + total);
        output = output.substring(0, output.length() - 3);
        for(int i = output.length() - 1; i >= 0; i--){
            reverse += output.charAt(i);
        }
        System.out.println(reverse + " = " + total);
        input.close();

    }
}


//Напишите программу Sum.java, которая складывает все цифры числа, 
// введенного пользователем, и выводит результат на экран. Например, 
// если пользователь вводит число 1018, то на экран будет выведено 
// число 10. Результат должен быть выведен на экран в формате, показанном на скриншоте ниже.