package OOP_extra_exercise;

import java.util.Scanner;

public class Main {

	public final static Scanner SCANBOT = new Scanner(System.in);

	public static void main(String[] args) {

		Boolean running = true;
		while (running) {

			// check which calculation to choose
			String block = """
					What do you want to calculate?
					---------------------------------------
					1. calculate from fahrenheit to celcius
					2. calculate from celcius to fahrenheit
					---------------------------------------
					(press the corresponding number)
					""";
			System.out.print(block);
			int nfoEntered = SCANBOT.nextInt();

			if (nfoEntered == 1) {

				System.out.print("please enter Fahrenheit: ");
				Double enteredValue = SCANBOT.nextDouble();

				Temperature FTC;
				FTC = new Temperature(enteredValue, null);
				FTC.printFTC();

			} else {

				System.out.print("please enter celcius: ");
				Double enteredValue = SCANBOT.nextDouble();

				Temperature CTF;
				CTF = new Temperature(null, enteredValue);
				CTF.printCTF();

			}
			
			System.out.println("want to stop? 'y' or 'n'");
			String nfoLoop = SCANBOT.next();

			System.out.println("---------------------------------------");

			if (nfoLoop.equals("n")) {
				running = false;
				System.out.println("thx for choosing this programm");
			}
		}
	}
}