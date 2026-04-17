import java.util.Scanner;

public class ex7r {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = 0, second = 0, result = 0;

        System.out.print("Enter a first number: ");
        first = input.nextInt();

        System.out.print("Enter a second number: ");
        second = input.nextInt();

      
        System.out.println(first + " * "  + second + " = " );
                 
               
            for(int i = result; i < result + first+second; i+=second ){
                 result+=first; 
                 System.out.println(result + " + "  + first );      
                } 
                 System.out.println(first*second);                
             }
        }
            
       
    

//Создай програму которая будет считать умножения
//  число на число при этом будет расписывать то что будет 
// происходить Enter first number: 3
//Enter second number: 5
//3 * 5 = 
//3 + 3
//6 + 3
//9 + 3
//12 + 3
//15
// можно еще так: for(int i = 0; i < second; i++)
