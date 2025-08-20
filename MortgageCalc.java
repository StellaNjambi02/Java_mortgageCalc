import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main (String[] args){
        System.out.println("Mortgage Calculator");
        System.out.print("Enter the principle amount:");
        Scanner scanner=new Scanner(System.in);
        double principal=scanner.nextDouble();
       
        System.out.print("Enter the annual interest rate in %:");
        Scanner scanner2=new Scanner(System.in);
        double rate=scanner2.nextDouble();

        System.out.print("Enter the period in years:");
        Scanner scanner3=new Scanner(System.in);
        int years=scanner3.nextInt();
        
        double monthlyRate=rate/(12*100);
        int numberOfPayments=years*12;
        double mortgage=principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("Your monthly payment is: " + mortgageFormatted);

    }
    
}
