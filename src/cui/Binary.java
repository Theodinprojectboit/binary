package cui;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		while(true) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter number: ");
			String number = input.nextLine();
			
			int option = 0;
			
			while (option < 1 || option > 4) {
				System.out.printf("Of what type is your number?%n1. Decimal%n2. Binary%n3. Octal%n4. Hexadecimal%nAnswer: ");
				option = input.nextInt();
			}
			
			if(option == 1) {
				convertDecimal(number);
			}
			else if(option == 2) {
				convertBinary(number);
			}
			else if(option == 3) {
				convertOctal(number);
			}
			else {
				convertHexadecimal(number);
			}
		}	
	}
	
	public static void convertDecimal(String number) {
		int numberIntForm = Integer.parseInt(number);
		String binary = Integer.toBinaryString(numberIntForm);
		System.out.printf("%n1. Binary: %s%n2. Octal: %o%n3. Hexadecimal: %X%n%n", binary, numberIntForm, numberIntForm);
	}
	
	public static void convertBinary(String number) {
		int decimal = Integer.parseInt(number, 2);
		System.out.printf("%n1. Decimal: %d%n2. Octal: %o%n3. Hexadecimal: %X%n%n", decimal, decimal, decimal);
	}
	
	public static void convertOctal(String number) {
		int decimal = Integer.parseInt(number, 8);
		String binary = Integer.toBinaryString(decimal);
		System.out.printf("%n1. Decimal: %d%n2. Binary: %s%n3. Hexadecimal: %X%n%n", decimal, binary, decimal);
	}
	
	public static void convertHexadecimal(String number) {
		int decimal = Integer.parseInt(number, 16);
		String binary = Integer.toBinaryString(decimal);
		System.out.printf("%n1. Decimal: %d%%n2. Binary: %s%n3. Octal: %o%n%n", decimal, binary, decimal);
	}

}
