import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e;

        System.out.print("Enter value for a: ");
        a = input.nextInt();

        System.out.print("Enter value for b: ");
        b = input.nextInt();

        System.out.print("Enter value for c: ");
        c = input.nextInt();
        
        System.out.print("Enter value for d: ");
        d = input.nextInt();

        System.out.print("Enter value for e: ");
        e = input.nextInt();

        System.out.println("a uptated to: " + (a += 9));
        System.out.println("a uptated to: " + (b -= 4));
        System.out.println("a uptated to: " + (c *= 3));
        System.out.println("a uptated to: " + (d /= 2));
        System.out.println("a uptated to: " + (e %= 5));
        
        input.close();

    }
    
}

//Напишите программу Arithmetic.java, которая запрашивает
//  у пользователя ввод пяти чисел: a, b, c, d и e.
//  После ввода всех пяти чисел выполните над каждым из них 
// следующие вычисления с использованием составного присваивания: 
// прибавьте 9 к числу, присвоенному a; вычтите 4 из числа, присвоенного b; 
// умножьте число, присвоенное c, на 3; разделите число, присвоенное d, на 2; 
// вычислите остаток от деления числа, присвоенного e, на 5. 
// Пример выходных данных выглядит следующим образом. Messages -cp /home/codespace/.vscode-remote/data/User/workspaceStorage/-7d61335c-1/redhat.java/jdt_ws/Softdev1_1df6b5e8/bin Arithmetic 
//Enter value for a: 2
//Enter value for b: 3
//Enter value for c: 4
//Enter value for d: 5
//Enter value for e: 6
//a uptated to: 11
//a uptated to: -1
//a uptated to: 12
//a uptated to: 2
//a uptated to: 1