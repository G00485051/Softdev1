//b. Реализуйте вложенный цикл для вывода на экран следующего содержимого.
//part b:
//10
//10 11
//10 11 12
//.....
//10 11 12 13 14 15

public class ex61bincl {
    public static void main(String[] args) {
        System.out.println("Part b: ");
        for(int i = 10; i <= 15; i++){
            for(int j = 10; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
