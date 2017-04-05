
package salecompensation;
public class SalesEquation
{
     public double salesCal(double Sales)
    {
        double Salary = 50000;
        double Commission = .10;
        double AnnualSales = Sales * Commission;
        return AnnualSales + Salary;
    }
}

