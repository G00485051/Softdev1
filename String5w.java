import java.util.Scanner;

public class String5w {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        System.out.print("Type anuthing or 'quit' to exit");
        do{
            System.out.print("Enter text: ");
            input = in.nextLine();
            if(!input.equalsIgnoreCase("quit")){
            System.out.println("You typed: " + input); 
        }
        }while(!input.equalsIgnoreCase("quit"));
        in.close();
    }
}

