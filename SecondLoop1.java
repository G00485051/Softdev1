//Напишите программу SecondLoop.java, которая 
// реализует цикл while для вывода следующего 
// выражения на экран 20 раз.

public class SecondLoop1 {
    public static void main(String[] args) {
        int counter = 0; // initializer
        while(counter < 20){ // condition
            System.out.println("My Second While Loop");
            counter++; // incrementor
        }
    }
}
