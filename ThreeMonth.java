import java.util.Scanner;
public class ThreeMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 0;

        System.out.print("Enter month number: ");
        month = input.nextInt();

        if(month == 1){
            System.out.println("January");
        }else if(month == 2) {
            System.out.println("February");
        }else if (month == 3){
            System.out.println("March");
        }else if(month == 4){
            System.out.println("April");
         }else if(month <= 0 ){
            System.out.println("invalid input");
         }else{
            System.out.println("Month does not exist");
        }


    }
}

//Напишите программу Month.java, которая запрашивает 
// у пользователя ввод числа от 1 до 12 включительно.
//  В зависимости от введенного значения, выведите на 
// экран строку, отображающую месяц, который соответствует
//  этому числу. Для 1 выведите «Январь», для 2 — «Февраль» и т.
// д. Если введенное число не входит в диапазон от 1 до 12, 
// выведите «Месяц неизвестен». Вывод должен быть похож на примеры, показанные ниже.