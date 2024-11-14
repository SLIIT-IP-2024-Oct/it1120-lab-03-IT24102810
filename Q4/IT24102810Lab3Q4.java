import java.util.Scanner;

public class IT24102810Lab3Q4
{
    public static void main(String[] args)      
        {
        Scanner sun = new Scanner(System.in);
        int digit1,digit2,digit3,digit4,digit5;

        System.out.print("Enter a five-digit number: ");
        int number=sun.nextInt();

        digit1=number / 10000;
        System.out.print(digit1 + " ");

        digit2=(number / 1000) % 10;
        System.out.print(digit2 + " ");

        digit3=(number / 100) % 10;
        System.out.print(digit3 + " ");

        digit4=(number / 10) % 10;
        System.out.print(digit4 + " ");

        digit5=number % 10;
        System.out.print(digit5);
        }
}