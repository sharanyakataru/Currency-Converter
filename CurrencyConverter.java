import java.util.Scanner;
import java.util.*;
public class CurrencyConverter {
    public static void main(String[] args) {

        HashMap<String, Double> currency = new HashMap<>();

        currency.put("USD", 1.00);
        currency.put("INR", 82.69);
        currency.put("CAD",1.36);
        currency.put("EUR", 0.92);
        currency.put("GBP", 0.79);
        currency.put("KWD", 0.31);
        currency.put("CHF", 0.88);
        currency.put("BHD", 0.38);
        currency.put("OMR", 0.39);
        currency.put("JOD", 0.71);


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the currency converter!");
        while(true){
            String userOptions = "USD - United States Dollar\n" +
                    "INR - Indian Rupee\n" + "CAD - Canadian Dollar\n" +
                    "EUR - Euro\n" + "GBP - British Pound Sterling \n" +
                    "KWD - Kuwaiti Dinar\n" + "CHF - Swiss Franc\n" +
                    "BHD - Bahraini Dinar\n" + "OMR - Omani Rial\n" +
                    "JOD - Jordanian Dinar\n";
            System.out.println(userOptions);

            System.out.println("What is the currency to convert from:");
            String original_currency = input.nextLine();
            original_currency = original_currency.toUpperCase();


            System.out.println("What is the amount you want to convert: ");
            double amount = input.nextDouble();
            input.nextLine();

            if(amount < 1){
                System.out.println("Cannot convert this amount. Please put in a different amount.");
            }else{
                System.out.println("What is the currency you want to convert to?");
                String conversion_currency = input.nextLine();
                conversion_currency = conversion_currency.toUpperCase();


                if(currency.containsKey(original_currency) && currency.containsKey(conversion_currency)){
                    double original_rate = currency.get(original_currency);
                    double conversion_rate = currency.get(conversion_currency);
                    double converted_amount = (amount/ original_rate) * conversion_rate;
                    double rounded_amount = Math.round(converted_amount * 100)/ 100.0;

                    System.out.println(amount + " " + original_currency + " is equal to " + rounded_amount + " " + conversion_currency);
                } else {
                    System.out.println("Invalid currency entered.");
                }

            }

            System.out.println("Do you want to convert another currency? (yes/no)");
            String continueConversion = input.next().toLowerCase();
            input.nextLine();
            if (!continueConversion.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for using the currency converter!");
    }
            }
