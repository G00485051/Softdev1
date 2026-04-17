//Напишите программу ThirdLoop.java, которая реализует цикл 
// while для вывода вашего имени на экран 10 раз. Вывод должен
// включать текущее значение счетчика, за которым следует ваше имя.

public class ThirdLoop {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            System.out.println(x + ". Kevin");
            x++;
        }
    }
} 