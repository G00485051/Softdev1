import java.util.Scanner;

public class Cubes5w {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, total = 0;
        String output = "";

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++){
            total += (i * i * 1);
            if(i != number)
               output+= (i + "^3 + ");

        }
        
        System.out.println(total);
        System.out.println(output);
        input.close();
    }
}


//Напишите программу Cubes.java, которая запрашивает 
// у пользователя ввод числа и вычисляет сумму кубов 
// каждой цифры от 1 до введенного пользователем числа 
// с помощью цикла for. Пример вывода этой программы выглядит следующим образом.