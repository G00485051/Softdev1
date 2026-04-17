package lab16;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qty = 0;

        System.out.print("How many items for shopping list: ");
        qty = input.nextInt();

        String[] list = new String[qty];

        for(int i = 0; i < list.length; i++){
            System.out.print("Enter item " + (i + 1) + ": ");
            list[i] = input.next();
        }
        System.out.println("\nShopping List:\n");
        for(int i = 0; i < list.length; i++){
            System.out.println((i + 1) + ". " + list[i]);
    }
    input.close();
}
}



//Напишите программу ShoppingList.java, которая 
//запрашивает у пользователя ввод товаров для списка 
// покупок. Сначала пользователя следует попросить указать 
// количество товаров в списке покупок, а затем поочередно
//  вводить сами товары. Эти товары должны храниться в
//  массиве, а затем выводиться на экран.