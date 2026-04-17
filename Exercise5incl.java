//Напишите программу Exercise5.java, которая реализует 
//вложенный цикл для вывода на экран следующего текста.
//Подсказка: Внешний цикл выводит 1, затем 2 и так далее, 
// а внутренний цикл выводит 8, затем 6 и так далее. 
//1: 8, 6, 4, 2
//2: 8, 6, 4, 2
//3: 8, 6, 4, 2
//4: 8, 6, 4, 2
//5: 8, 6, 4, 2

public class Exercise5incl {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.print(i + ": ");
        for(int j = 8; j >= 2; j --, j--){  //or just>...; j -= 2
            System.out.print(j);
         
            if( j != 2){
                System.out.print(", ");
             }
           }
         System.out.println();
        } 
      }
    }

