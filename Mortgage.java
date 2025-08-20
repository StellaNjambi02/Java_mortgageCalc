import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage{
   
    public static void main (String[] args){
        final byte PERCENTAGE=100;
        final byte MONTHS_IN_YEAR=12;
        System.out.println("Mortgage Calculator"); 
        Scanner scanner=new Scanner(System.in);
        double principal=0;
        double rate=0;
        int years=0;
        // Input validation for principal and rate
        while(true){
         System.out.print("Enter the principle amount:($1K=$1M)");
         principal=scanner.nextDouble();
         if(principal>=1000 && principal<=1_000_000){
            break;
         }
            System.out.println("Enter a value between $1,000 and $1,000,000");
    
        }

         // Input validation for rate
       while(true){
        System.out.print("Enter the annual interest rate in %:");
        rate=scanner.nextDouble();
        if(rate>=1 && rate<=30){
            break;
        }
            System.out.println("Enter a value between 1% and 30%");
       }
       
       // Input validation for years
       while(true){
        System.out.print("Enter the period in years:");
        years=scanner.nextInt();
        if(years>=1 && years<=30){
            break;
        }
            System.out.println("Enter a value between 1 and 30 years");}
        
        double monthlyRate=rate/PERCENTAGE/ MONTHS_IN_YEAR;
        int numberOfPayments=years* MONTHS_IN_YEAR;
        double mortgage=principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("Your monthly payment is: " + mortgageFormatted);

    }
    
}

