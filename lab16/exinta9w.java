package lab16;

public class exinta9w {
    public static void main(String[] args) {
        int[]x = new int[5];
         for(int i = 0, val = 1; i < x.length; i++, val++){
            x[i] = val;
        }
        System.out.println("Index\tValue\n");
         for(int i = 0; i < x.length; i++){
         System.out.println(i + "\t" + x [i]);
        }
    }
}
