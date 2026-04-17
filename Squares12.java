public class Squares12 {
    public static void main(String[] args) {
        int i = 1, max = 10, total = 0;
        String div = "--------------";
        System.out.println(div);
        System.out.println("Number\tSquare");
        System.out.println(div);
        while (i <= max) {
            System.out.println(i + "\t" + (i * i));
            i++;
            
        }
    }
}

//Измените программу SquaresArithmetic из предыдущего упражнения, 
// чтобы она создавала таблицу с результатами в выводе. Вывод 
// должен быть сформирован с использованием строки, которая затем 
// должна быть передана методу System.out.println(). Назовите 
// измененную программу SquaresArithmeticTable.java. 
// Вывод должен выглядеть следующим образом.