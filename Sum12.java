public class Sum12 {
    public static void main(String[] args) {
        int total = 0, odd = 0, even = 0, i = 1;

        while (i <= 100 ) {
            total = total + i;
            if(i%2 == 0){
                even = even + i;

            }else{
                odd += i;
            }
            i++;
        }
         System.out.println( "Sum of the numbers: " + total);
          System.out.println( "Even total: " + even);
           System.out.println( "Odd total: " + odd);
           if(odd > even){
              odd = odd - even;
           }else{
            odd = even - odd;
           }
           System.out.println("Diff: " + odd);
    }
}

//Напишите программу Sum.java, которая
// реализует цикл для вычисления: суммы всех чисел от 1 до 100;
// суммы всех четных чисел от 1 до 100; 
// суммы всех нечетных чисел от 1 до 100; 
// разницы между суммой нечетных чисел и суммой четных чисел 
// (вычитание меньшего числа из большего). Пример вывода этой программы показан ниже.