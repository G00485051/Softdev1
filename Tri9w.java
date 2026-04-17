
public class Tri9w {
    public static void main(String[] args) {
        int rows = 10, colums = 1, spaces = 10;
        while (rows >= 1 ) {
            while (spaces > rows) {
                System.out.print(" ");
                spaces--;
                
        }
        spaces=10;  
        while (colums <= rows) {
            System.out.print("*"); 
            colums++;
        }
        colums = 1;
        System.out.println(); 
       
        rows--;   
        }      
    }
}
