
package salecompensation;
import java.util.Scanner;
public class SaleCompensation
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your annual sales: $");
        double Sales = keyboard.nextDouble(); // Double was used to ensure decimal is used if needed
        SalesEquation SalesEquation = new SalesEquation(); // This is calling for the SaleEquation class
        System.out.println("Your total compensation is: $" + SalesEquation.salesCal(Sales));
    }   
}
