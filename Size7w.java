import java.util.Scanner;

public class Size7w {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter size: ");
        size = input.nextInt();

        if(size > 100 || size < 10){
           System.out.print("Size is not available ");
        }else if(size <= 100 || size > 70){
            System.out.print("Go for large size ");
        }else if(size <= 70 || size > 35){
            System.out.print("Go for Medium size ");
        }else{
            System.out.print("“Go for small size ");
}

    }
}