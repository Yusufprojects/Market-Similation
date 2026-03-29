import java.util.Scanner;

public class MarketSimulation
{

    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        double TotalPrice =0;
        int Selection;
        boolean Shopping=true;

        System.out.println("Welcome to the Market Simulation Program");
        System.out.println("1 - Bread (10 Euros)");
        System.out.println("2 - Milk (30 Euros)");
        System.out.println("3 - Cheese (50 Euros)");
        System.out.println("4 - Tomato (20 Euros)");
        System.out.println("For Quit Press 0");



        while (Shopping)
        {
            System.out.print("Please enter your choice: ");
            Selection=scanner.nextInt();

            switch (Selection){
                case 1:
                    TotalPrice +=10;
                    System.out.println("Bread has been added. Total price is "+TotalPrice);
                    break;

                case 2:
                    TotalPrice +=30;
                    System.out.println("Milk has been added. Total price is "+TotalPrice);
                    break;

                case 3:
                    TotalPrice +=50;
                    System.out.println("Cheese has been added. Total price is "+TotalPrice);
                    break;

                case 4:
                    TotalPrice +=20;
                    System.out.println("Tomato has been added. Total price is "+TotalPrice);
                    break;

                case 0:
                    Shopping=false;
                    break;

                default:
                    System.out.println("Invalid choice! Try again");

            }

        }
        System.out.println("Enter payment amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Total price is "+TotalPrice);
        System.out.println("Do you have discount coupon? (Y/N): ");

        String choice = scanner.next();
        if (choice.equalsIgnoreCase("Y"))
        {
            System.out.print("Enter your discount code: ");
            String code = scanner.next();

            if (code.equals("DISCOUNT10")){
                TotalPrice *= 0.90;
                System.out.println("Code has been applied. New total price is: "+TotalPrice);
            }
            else{
                System.out.println("Invalid code!");
            }

            if(amount >= TotalPrice){
                System.out.println("Payment successful! The change is:"+(amount-TotalPrice));
            }
            else{
                System.out.println("Payment failed! The missing amount of money is:"+(TotalPrice - amount));

            }

        }
        else
        {

            if(amount >= TotalPrice)
            {
            System.out.println("Payment successful! The change is:"+(amount-TotalPrice));
            }
            else
            {
            System.out.println("Payment failed! The missing amount of money is:"+(TotalPrice - amount));
            }

        }
        System.out.println("Thank you for choosing us.");
    }
}