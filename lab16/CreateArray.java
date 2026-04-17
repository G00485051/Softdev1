package lab16;

import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int type = 0, size = 0;
         System.out.print("Enter array type - 1 for int, 2 for double: ");
         type = input.nextInt();

         System.out.print("Enter array size: "); 
         size = input.nextInt();
         if(type == 1){
            int[] numbers = new int[size];
            for(int i = 0; i < numbers.length; i++){
                System.out.print("Enter value " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
                }
            for(int i = 0; i < numbers.length; i++){
                System.out.println((i + 1) + ". " + numbers[i]);
            }
        }else if(type == 2){
                double[] numbers = new double[size];
            for(int i = 0; i < numbers.length; i++){
                System.out.print("Enter value " + (i + 1) + ": ");
                numbers[i] = input.nextDouble();
            }
            for(int i = 0; i < numbers.length; i++){
                System.out.println((i + 1) + ". " + numbers[i]);
            }
        }
    }
}



//Напишите программу CreateArray.java, которая запрашивает у пользователя
//  тип массива для создания (массив int или массив double), а также
//  количество значений в массиве. Затем программа должна запрашивать 
// у пользователя значения для заполнения массива и выводить значения
//  массива на экран, аналогично тому, как показано на скриншоте ниже: