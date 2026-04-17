package lab16;

public class Methods {
    public static void main(String[] args) {
        method1();
        Methods m = new Methods();
        m.methods2(); 
        m.methods3(300);
        m.methods4(32, "Tom", 3.4);
        int y = m.method5(10);
        System.out.println(y);
        
    }
    //static method which returns nothing
    public static void method1(){
        System.out.println("Method 1");

    }
    //instance method which returns nothing
    void methods2(){
        System.out.println("Method 2");
    }
    void methods3(int x){
        System.out.println("Method 3: " + x);
    }
    void methods4(int x, String name){
        System.out.println("Method 4: " + x + " and " + name + " and " + y );
    }
    int method5(int x){
        x = x + 2;
        return x;
    }

}
