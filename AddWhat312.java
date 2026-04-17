import java.util.Scanner;

public class AddWhat312 {
    public static void main(String[] args) {
        int number=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = input.nextInt();
        
        if(number > 100){
            number *= 10;
        }else if(number > 50){
            number *= 5;
        }else if(number > 20){
            number *= 2;
        }else{
            number++;
        } 
        System.out.println(number);
        input.close();
    }
}



//Напишите программу AddWhat3.java, которая запрашивает 
// у пользователя ввод числа. Затем добавьте к введенному
//  пользователем числу определенное число. Прибавление числа
//  к введенному значению зависит от следующих условий: 
// если введенное число больше 100, добавьте к нему 10 и 
// выведите результат на экран. Если введенное число больше 50
//  и меньше или равно 100, добавьте к нему 5 (*) и выведите результат
//  на экран.Если введенное число больше 20 и меньше или равно 50, 
// добавьте к нему 2 и выведите результат на экран. Если
//  введенное число меньше или равно 20, добавьте к нему 1 
// и выведите результат на экран.Enter number: 90
//450