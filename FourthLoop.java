//Напишите программу FourthLoop.java, которая реализует цикл 
// while, выполняющийся 10 раз и выводящий на экран значение 
// счетчика. Обратите внимание, что значение счетчика будет 
// обновляться на 1 в каждой итерации цикла. Пример вывода 
// выглядит следующим образом.

public class FourthLoop {
    public static void main(String[] args) {
       int x = 1;
        while (x <= 10) {
            System.out.println("Loop counter: " + x);
            x++;
        }
    }
}
