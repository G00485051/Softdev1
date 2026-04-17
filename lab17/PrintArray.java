package lab17;

public class PrintArray {
    public static void main(String[] args) {
        
        int[]x = (1,2,3,4,5,6,7,8,9,10);
    
        outputArray(x);

    }  

    static void outputArray(int[] array){
        System.out.println("Index\Value\tSquare");
        System.out.println("++++++\t++++++\t++++++");
        for(int i = 0; i < array.length; i++){
            System.out.println(i + "\t" + array[i] + "\t" + squareOf(array[i]));
        }
    }

    static int squareOf(int val){
        return val * val;
    }
 }

