import java.util.Scanner;
public class Small13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int small = 0, total = 0, number = 0;

        System.out.print("How many numbers: ");
        total = input.nextInt();

        for(int i = 1; i <= total; i++){
         System.out.print("Enter number " + i + ": ");
         number = input.nextInt();

         if(i == 1){
            small = number;
         }else{
            if(number < small){
                small = number;
            }
         }
     }
     
        System.out.println("Smallest number is: " + small);
        input.close();
    
    }
}

//Напишите программу Small.java, которая находит
//  наименьшее из нескольких целых чисел. Предположим, 
// что первое прочитанное значение указывает количество 
// значений, которые должен ввести пользователь. 
// Ваше решение должно использовать цикл for. 
// Пример вывода выглядит следующим образом.