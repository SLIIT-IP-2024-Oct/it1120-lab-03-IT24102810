import java.util.Scanner;

public class IT24102810Lab3Q1A {
    public static void main(String[] arge) {
        Scanner kgprice = new Scanner(System.in);
        float price, kilo, ans;
        System.out.println("enter the price of 1KG of rice:");
        kilo = kgprice.nextFloat();
        System.out.println("enter theno of kilograms you want to buy:");
        price = kgprice.nextFloat();
        ans = price * kilo;
        System.out.println("the total amount is :" + ans);
    }
}
