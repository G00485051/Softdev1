//Напишите программу Exercise3.java, которая 
// реализует цикл для вывода чисел от 1 до 20 в одну строку.

public class Exercise3incl {
    public static void main(String[] args) {
        String output = "";
        for(int i = 1; i <= 20; i++){
            output += i + ", ";
        }
        output = output.substring(0, output.length() -2);
        System.out.print(output);
 
        for(int i = 1; i <= 10; i++){
            System.out.print(i + ", ");
        }
        System.out.println("20");
    }
}
