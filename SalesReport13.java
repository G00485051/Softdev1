import java.util.Scanner;
public class SalesReport13 {
    Scanner input = new Scanner(System.in);
        double gross = 0;
        int qty, total = 0;
        String output = " ";

        output += "--------------------------------\n";
        output += "Item\t\tSold\tTotal\n";
        output += "--------------------------------\n";

        for(int i =1; i <= 4; i++){
            System.out.print("Quantity sold of product " + i + ": ");
            qty = input.nextInt();
            total = 0;
            if(i == 1){
                gross += qty * 239.99;
            }else if(i == 2){
                gross += qty * 129.75;
            }else if(i == 3){
                gross += qty * 99.96;
            }else{
                gross += qty * 350.89;
            }
            output += "Product" + i + "\t" + qty + "\t" + total + "\n";
        }
        
        System.out.println("Total earnings: " + Math.round(gross * 0.09 + 200));
        input.close();
}
}


//Программа должна использовать цикл for, чтобы запрашивать
//  у пользователя количество каждого товара, проданного продавцом, 
// а затем рассчитывать его общий доход за эту неделю (200 евро плюс 9% от общей суммы продаж).
//  Пример выходных данных этой программы выглядит следующим образом: Используйте 
// Math.round() для округления суммы дохода до ближайшего евро.
