//Это ваша четвертая оценка по курсу «Разработка 
// программного обеспечения 1». Напишите программу
// Exercise1.java, которая реализует цикл для вывода 
// каждой оценки на отдельную строку на экран. Пример 
// вывода выглядит следующим образом.

public class ex1incl {
    public static void main(String[] args) {
        int times = 0;

        System.out.println("While Loop");
        System.out.println("----- ----");
        int i = 1;
        while (i <= 4) {
            System.out.println("Assesment " + i);
            i++;
        }
        System.out.println();
        System.out.println("For Loop");
        System.out.println("--- ----");
        for(i = 1; i <= 4; i++){
            System.out.println("Assesment " + i);
        }
        System.out.println();
        System.out.println("do while");
        System.out.println("--- ----");
        i = 1;
        do{
            System.out.println("Assesment " + i);
            i++;
        }while(i <= 4);

    }
}
