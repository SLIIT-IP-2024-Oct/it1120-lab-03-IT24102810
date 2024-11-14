import java.util.Scanner;

public class IT24102810Lab3Q1B {
    public static void main(String[] arge) {
        Scanner kgprice = new Scanner(System.in);
        float price, kilo,discount,ans;
        System.out.print("enter the price of 1KG of rice:");
        kilo = kgprice.nextFloat();
        System.out.print("enter theno of kilograms you want to buy:");
        price = kgprice.nextFloat();
        discount=price*10/100;
        ans = (price-discount) * kilo;
        System.out.print("the total amount is :" + ans);
    }
}
