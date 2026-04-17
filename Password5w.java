import java.util.Scanner;

public class Password5w {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pw = "";
        int attempts = 0;
        do{
            System.out.print("Enter password: ");
            pw = input.next();

        }while(!pw.equals("mypass") && attempts < 3);
        if(attempts < 3)
             System.out.println("Access granted");
        else
             System.out.println("Access denied");

        input.close();
    }
}


//Напишите программу Password.java, которая будет запрашивать 
// у пользователя ввод пароля. Если введенный пароль равен «mypass»,
//  отображается соответствующее сообщение. В противном случае пользователю
//  снова предлагается ввести пароль, пока не будет введен правильный пароль.
//  Пример вывода из этой программы выглядит следующим образом.