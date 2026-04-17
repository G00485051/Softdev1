import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter number: ");
        x = input.nextInt();
        System.out.print(x);
        if((x %= 2) == 0){
            System.out.println(" is an even number");
        }else{
            System.out.println(" is an odd number");
        } 
        input.close(); 



    }
}


//Напишите программу EvenOdd.java, которая определяет, 
// является ли число, введенное пользователем, четным 
// или нечетным. Используйте оператор if ... else в вашем решении.
//  В условии следует использовать составной оператор присваивания %=,
//  чтобы определить, является ли число четным или нечетным.