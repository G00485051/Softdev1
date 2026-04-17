package InClass;

import lab16.Methods;

public class methods {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        if(args.length > 0){
            System.out.println("args values") ;
            for(int i = 0; i < args.length;i++){
                System.out.print(args[i] + " ");
            }
            System.out.println();
        }

        Methods methods = new Methods();
        methods.method1();
        methods.method2(51, 51, 47);
        String value = methods.method3();
        System.out.println("methods returned: " + value);
        System.out.println("methods4 returned: " + res);
        System.out.println("methods4 returned: " + methods.method4(500, 1000));
    }

    void method1 (){
         System.out.println("method1");
    }
    void method2 (int x, double y){
         System.out.println(x + " and " + y);
    }
    String method3(){
        String val = "Hello from Method 3";
        return val;
    }
    int method4(int x, int y){
        return x + y;
    }
}

