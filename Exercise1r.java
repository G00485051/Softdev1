import java.util.Scanner;

public class Exercise1r {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int total = 0;

        System.out.print("Enter number: ");
        i = input.nextInt();
                
                while (i >= 10) {
                    if(i == 10){
                    System.out.print(i);
                }else{
                    System.out.print(i + " + ");
               } 
                total += i;
                i -= 5; 
                
            }
           System.out.println(" = " + total);
        }
    }
                
            
          
        
    

//Напиши код для программы которая будет
//  считать суму чисел суммировать изначальное 
// число с 10 числами от которых по очеркдно 
// отнимается 5
//Enter start number: 50
//50 + 45 + 40 + 35 + 30 + 25 + 20 + 15 + 10 + 5 = 275