//Напишите программу с именем Exercise2.java,
//  которая реализует цикл для вывода первых трех 
// месяцев года. На первой итерации выведите «январь»,
//  на второй — «февраль», а на третьей — «март». Пример 
// вывода выглядит следующим образом.

public class ex2incl {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 3; i++){
            if(i == 1){
                System.out.println("Jenuary");
            }else if(i == 2) {
                System.out.println("February");
            }else{
                System.out.println("March");
            }
        }
    }
}
