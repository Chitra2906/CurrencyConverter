package converter;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CurrencyConverter {
	public static void main(String[] args) {

		Logger logger = LogManager.getLogger(CurrencyConverter.class);

		HashMap<Integer, String> CurrencyCode = new HashMap<Integer,String>();
		CurrencyCode.put(1, "Euro");
		CurrencyCode.put(2, "CAD");
		CurrencyCode.put(3, "USD");

		HashMap<String,Float> CurrencyConversion = new HashMap<String, Float>();
		CurrencyConversion.put("Euro", (float) 0.012);
		CurrencyConversion.put("CAD",(float) 0.017);
		CurrencyConversion.put("USD",(float) 0.013);

		String  toCode;

		double amount;

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to currency convertor \t Base currency is INR");
		System.out.println("Currency converting to?");
		System.out.println("1 :Euro \t 2: CAD \t 3:USD");
		toCode = CurrencyCode.get(sc.nextInt());

		System.out.println("Enter Amount : ");
		amount = sc.nextDouble();

		Float rate = CurrencyConversion.get(toCode);
		System.out.println(rate);
		logger.info("User tried to convert INR to "+toCode+" for amount " + amount );
		System.out.println("After conversion : " + amount*rate);
		logger.info(toCode + " converted amount is " + amount*rate);
		System.out.println("Thank you for using");

	}


}
