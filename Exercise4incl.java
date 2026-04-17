public class Exercise4incl {
    public static void main(String[] args) {
                int i = 20;
                int total = 0;
                while (i >= 10) {
                    if(i == 10){
                    System.out.print(i);
                }else{
                    System.out.print(i + " + ");
               } 
                total += i;
                i -= 2; 
                
            }
           System.out.println(" = " + total);
        }
    }


    //Напишите программу с именем Exercise4.java, которая
    //  реализует цикл для вывода всех четных чисел от 20 до
    //  10, так чтобы на первой итерации выводилось 20, на
    //  второй — 18 и так далее. Выведите результат сложения 
    // всех этих чисел. Вывод на экран должен быть в одной строке
    //  и выглядеть примерно так: