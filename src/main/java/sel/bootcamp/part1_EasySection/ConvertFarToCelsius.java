package sel.bootcamp.part1_EasySection;

import java.util.Scanner;

public class ConvertFarToCelsius {
	
	public static void main (String [] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit:");
		double far = scan.nextDouble();
		
		double celsius = (far - 32) * 5/9;
		System.out.println("The temperature in Celius is:");
		System.out.println(celsius);
		scan.close();
	}
}