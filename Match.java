import java.util.Scanner;
public class Match {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1, str2;

        System.out.print("Enter a string:");
        str1 = input.nextLine();
        System.out.print("Enter another string:");
        str2 = input.nextLine();

        if(str1.equals(str2)){
            System.out.println("String match");
        }else{
            System.out.println("String do not match");
        }

        input.close();
        
    }
}

//Напишите программу Match.java, которая запрашивает у 
// пользователя ввод двух строковых значений. Используя метод 
// `equals`, проверьте, совпадают ли введенные пользователем строки. 
// Выведите на экран сообщение, указывающее, совпадают ли строки или нет.