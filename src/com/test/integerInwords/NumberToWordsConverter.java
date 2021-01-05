package com.test.integerInwords;

import java.text.NumberFormat;
import java.util.Scanner;

public class NumberToWordsConverter {
	
	public static final String[] digits = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", "",	"Twenty", "Thirty","Forty","Fifty", "Sixty", "Seventy","Eighty","Ninety" 	
	};
	
	public static String convert(final int n) {
		if (n < 0) {
			return "Minus " + convert(-n);
		}

		if (n < 20) {
			return digits[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + digits[n % 10];
		}

		if (n < 1000) {
			return digits[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}

		if (n < 100000) {
			return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
		}


		return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
	}

	public static void main(String[] args) {
		
		int n;
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter a your digit number to convert into word format");
		n =scan.nextInt();
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");
		scan.close();
		
	}

	}


