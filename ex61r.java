import java.util.Scanner;

public class ex61r {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = 0, gap = 0;

        System.out.print("Enter number: ");     
        num = input.nextInt();

        System.out.print("Enter gap: ");
        gap = input.nextInt();        

        for(int i = num; i < num + 10*gap; i += gap){
      System.out.println(i);
    }

  }
}
