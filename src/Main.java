import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variables
        Scanner scan=new Scanner(System.in);
        int amountOfPeople;
        double originalTotal; //cost of meal before tips
        int tipPercent; //tip
        double tipTotal; //cost of tip
        double tipPerPerson; //splitting the total tip by the amount of people
        double totalPerPerson; //splitting whole bill by the amount of people
        double finalTotal; //cost of meal after tips
        //input
        System.out.println("How many people are in the party?: ");
        amountOfPeople=scan.nextInt();
        System.out.println("What is the cost of the bill?: ");
        originalTotal=scan.nextDouble();
        System.out.println("What percent of the bill are you willing to tip?: ");
        tipPercent=scan.nextInt();
        System.out.println();
        System.out.println("Receipt:");
        tipTotal=(double)tipPercent/100*originalTotal;
        tipPerPerson=Math.round(tipTotal*100)/100.0/amountOfPeople;
        finalTotal=(Math.round((tipTotal+originalTotal)*100)/100.0);
        totalPerPerson=(Math.round(finalTotal/amountOfPeople*100))/100.0;
        System.out.println("Amount of People in Party: "+amountOfPeople);
        System.out.println("Original Cost: $"+originalTotal);
        System.out.println("Tip Percent: "+tipPercent+"%");
        System.out.println("Total Tip: $"+(Math.round(tipTotal*100))/100.0);
        System.out.println("Final Amount Due: $"+finalTotal);
        System.out.println("Tip per Person: $"+(Math.round(tipPerPerson*100))/100.0); //rounding at the end for more accurate results
        System.out.println("Total per Person: $"+(Math.round(totalPerPerson*100))/100.0);
        System.out.println("Thank you for your business :)");





    }
}