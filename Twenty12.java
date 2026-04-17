public class Twenty12 {
    public static void main(String[] args) {
        int i = 1;
        int max = 20;
        while (i < max) {
            System.out.print(i);
            if(i < max){
                System.out.print(" + ");
            }
            i++;
        }
         System.out.println();
         i = 1;
         while (i < max) {
            System.out.print(i + " + ");
            i++;
         }
          System.out.print(i);
           System.out.println();
    }
}


//Взгляните на следующий код: Что выведет этот код?
//  Измените его так, чтобы он выводил все 20 чисел 
// со знаками плюс между ними и пробелом с каждой стороны, 
// но без знака плюс в конце, то есть 1 + 2 + 3 + 4 + 5 + 6 + 7
//  + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20.
//  Назовите программу TwentyNums.java