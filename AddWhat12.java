
import java.util.Scanner;
public class AddWhat12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        System.out.print("Enter number: ");
        number = input.nextInt(); 
        if(number > 20){
            number += 2;
        }else if(number >10 && number <= 20){
            number = number + 3;
        }else if(number <= 10){
            number++;
        }
        System.out.println(number);

        if(number > 20){
            number += 2;
        }else if(number <= 10){
            number++;
        }else{
            number +=3;
        }
        System.out.println(number);

        input.close();
    }
}



//Напишите программу AddWhat1.java, которая запрашивает
//  у пользователя ввод числа. Затем добавьте к введенному
//  пользователем числу определенное число. Если введенное 
// число больше 20, добавьте к нему 2 и выведите результат 
// на экран.Если введенное число больше 10 и меньше или равно 20,
//  добавьте к нему 3 и выведите результат на экран. 
// Если введенное число меньше или равно 10, добавьте
// к нему 1 и выведите результат на экран.
//Enter number: 3
//4
//5
