public class Exercise6incl {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
            System.out.print(j + " ");
         }
         System.out.println();
       }

         System.out.println("Part b:");
            for(int i = 10; i <= 15; i++) {
               for(int j = 10; j <= i; j++){ 
                 System.out.print(j + "  " );
            }
         
          System.out.println();
        }
    }
}




//Напишите программу под названием Exercise6.java. 
// Требования к этой программе следующие: а. Реализуйте 
// вложенный цикл для вывода на экран следующего содержимого. 
//Part a:
//1
//1 2
//1 2 3...
//1 2 3 4 5 6
//b. Реализуйте вложенный цикл для вывода на экран следующего содержимого.
//part b:
//10
//10 11
//10 11 12
//.....
//10 11 12 13 14 15