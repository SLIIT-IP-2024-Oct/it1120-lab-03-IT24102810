import java.util.Scanner;

public class IT24102810Lab3Q3
{
    public static void main(String[]arge) 
    {
        Scanner sun=new Scanner(System.in);
        int no1,ans;
        System.out.println("enter the rupee amount");
        no1=sun.nextInt();
        System.out.println("5000 Notes - " + no1 / 5000);
        no1 %= 5000;
        System.out.println("1000 Notes - " + no1 / 1000);
        no1 %= 1000;
        System.out.println("500 Notes - " + no1 / 500);
        no1 %= 500;
        System.out.println("200 Notes - " + no1 / 200);
        no1 %= 200;
        System.out.println("100 Notes - " + no1 / 100);
        no1 %= 100;
        System.out.println("50 Notes - " + no1 / 50);
        no1 %= 50;
        System.out.println("20 Notes - " + no1 / 20);
        no1 %= 20;
        System.out.println("10 coin - " + no1 / 10);
        no1 %= 10;
        System.out.println("05 coins - " + no1 / 5);
        no1 %= 5;
        System.out.println("02 coins - " + no1 / 2);
        no1 %= 2;
        System.out.println("01 coins - " + no1);

        
    }
}