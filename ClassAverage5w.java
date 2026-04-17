import java.util.Scanner;

public class ClassAverage5w {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0, grade =0 , total = 0;

        System.out.print("Enter a grade(negative number to quit): ");
        grade = input.nextInt();
        while(grade > 0) {
            total += grade;
             System.out.print("Enter a grade(negative number to quit): ");
             grade = input.nextInt();
             counter++;
        }
        System.out.println("Averege grade is: " + ((double) total / counter));
        input.close();
    }
}


//Enter a grade(negative number to quit): 34
//Enter a grade(negative number to quit): 5
//Enter a grade(negative number to quit): 6
//Enter a grade(negative number to quit): -3
//Averege grade is: 15.0