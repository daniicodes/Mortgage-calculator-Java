import java.text.NumberFormat;
import java.util.Scanner;

public class Morgagecalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Principle : ");
        double principle= s.nextInt();

        System.out.print("Annual interest rates : ");
        double air = s.nextDouble();

        System.out.print("Period : ");
        int period = s.nextInt();
        // Calculate monthly interest rate and number of payments
        double monthlyInterestRate = air / 12 / 100;
        int numberOfPayments = period * 12;

        // Calculate mortgage
        double mortgage = principle * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

}