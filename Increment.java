import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 10;
        System.out.println("Number before post incorement: " + number);
        System.out.println("Post incorement number: " + number++);
        System.out.println("Number after post incorement: " + number);

        number = 10;
        System.out.println("Number before post incorement: " + number);
        System.out.println("pre incorement number: " + ++number);
        System.out.println("Number after incorement: " + number);

        number = 10;
        System.out.println("Number before decrement: " + number);
        System.out.println("post decrement: " + number--);
        System.out.println("Number after decrement: " + number);
        
        number = 10;
        System.out.println("Number before decrement: " + number);
        System.out.println("pre decrement: " + --number);
        System.out.println("Number after incorement: " + number);


    }
}


//Напишите программу Increment.java, которая использует 
// операторы постинкремента и преинкремента для числовой переменной.
//  Числовой переменной должно быть присвоено значение 10 до применения 
// к ней каких-либо операторов. Пример вывода этой программы выглядит следующим образом.