import java.util.Scanner;
public class IT24102810Lab3Q2
{
    public static void main(String [] arge)
    {
        Scanner sun=new Scanner(System.in);
        double no1,no2,no3,amount,salary;

        System.out.print("enter month salary:");
        no1=sun.nextDouble();

        System.out.print("enter the number of OT hours:");
        no2=sun.nextDouble();

       System.out.print("enter the OT rate:");
       no3=sun.nextDouble();

       amount=no2*no3;
       salary=no1+amount;
       System.out.print("The total salary including OT is:" + salary);
    }
}