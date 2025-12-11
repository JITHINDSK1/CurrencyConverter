import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Define the rates (Value of 1 Rupee)
        double inr = 1.0;
        double usd = 0.011120;
        double eur = 0.009546;
        double gbp = 0.008347;
        double aud = 0.016721;

        // 2. Ask user for input
        System.out.println("Choose: 1=INR, 2=USD, 3=EUR, 4=GBP, 5=AUD");
        
        System.out.print("Convert FROM (enter number): ");
        int from = scan.nextInt();

        System.out.print("Convert TO (enter number): ");
        int to = scan.nextInt();

        System.out.print("Enter Amount: ");
        double amount = scan.nextDouble();

        // 3. Find the 'from' rate using simple if statements
        double rate1 = 0;
        if (from == 1) rate1 = inr;
        if (from == 2) rate1 = usd;
        if (from == 3) rate1 = eur;
        if (from == 4) rate1 = gbp;
        if (from == 5) rate1 = aud;

        // 4. Find the 'to' rate
        double rate2 = 0;
        if (to == 1) rate2 = inr;
        if (to == 2) rate2 = usd;
        if (to == 3) rate2 = eur;
        if (to == 4) rate2 = gbp;
        if (to == 5) rate2 = aud;

        // 5. Calculate and Print
        // Math: Amount * (Target Rate / Source Rate)
        double result = amount * (rate2 / rate1);
        
        System.out.println("Result: " + result);
    }
}
