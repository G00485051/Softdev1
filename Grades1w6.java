import java.util.Scanner;

public class Grades1w6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0, number = 3, i = 1;

        for(; number >= 0; i++){
            System.out.print("Enter grade " + (i + 1) + " (nagative number to quit): ");
            number = input.nextInt();
        if(number >= 0){
            i++;
            total += number;
          }
        }
        System.out.println("Total: " + total);
        System.out.println("Averege grade: " + ((total * 1.0)/i));
        System.out.printf("Averege grade: %.2f%n" , ((total * 1.0)/i));
    }
}

//Напишите программу Grades1.java, которая запрашивает
//  у пользователя 10 оценок. Программа должна вычислить
//  средний балл и вывести его на экран. Используйте цикл 
// while, управляемый счетчиком, для этого задания.