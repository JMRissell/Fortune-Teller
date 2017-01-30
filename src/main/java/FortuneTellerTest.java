import java.util.Arrays;
import java.util.Scanner;

public class FortuneTellerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String reFortune;
		do {
			// Part 1 - Take User Inputs
			System.out.println("What is your first name?");
			String firstName = scanner.next();
			firstName = firstName.toLowerCase();

			System.out.println("What is your last name?");
			String lastName = scanner.next();
			lastName = lastName.toLowerCase();

			System.out.println("How old are you?");
			Integer age = null;
			while (age == null) {
				try {
					age = scanner.nextInt();

				} catch (Exception e) {
					System.out.println("Please enter a valid age.");
					scanner.next();
				}
			}

			System.out.println("Please type your birth month");
			String birthMonth = null;
			String[] birthMonthWL = { "january", "february", "march", "april", "may", "june", "july", "august",
					"september", "october", "november", "december" };
			boolean monthFound = false;
			while (monthFound == false) {
				birthMonth = scanner.next();
				birthMonth = birthMonth.toLowerCase();
				monthFound = Arrays.asList(birthMonthWL).contains(birthMonth);
				if (monthFound) {
					break;
				} else {
					System.out.println("Please enter a valid month.");
				}
			}

			System.out.println("What is your favorite ROYGBIV color? Type \"help\" if needed.");
			String color = null;
			String[] colorWL = { "red", "orange", "yellow", "green", "blue", "indigo", "violet" };
			boolean colorFound = false;
			while (colorFound == false) {
				color = scanner.next();
				color = color.toLowerCase();
				colorFound = Arrays.asList(colorWL).contains(color);
				if (colorFound) {
					break;
				} else {
					System.out.println(
							"Please enter any of the following colors: 'red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'");
				}

			}

			System.out.println("How many siblings do you have?");
			Integer siblings = null;
			while (siblings == null) {
				try {
					siblings = scanner.nextInt();

				} catch (Exception e) {
					System.out.println("Please enter a valid number.");
					scanner.next();
				}
			}

			// Part 2 - Do Something w. User Inputs
			int retireAge = -1;
			if (age % 2 == 0) {
				retireAge = 30;
			} else {
				retireAge = 40;
			}

			String geoLocation = null;
			if (siblings == 0) {
				geoLocation = "Texas";
			} else if (siblings == 1) {
				geoLocation = "Wisconsin";
			} else if (siblings == 2) {
				geoLocation = "California";
			} else if (siblings == 3) {
				geoLocation = "Florida";
			} else if (siblings > 3)
				geoLocation = "Illinois";

			String xPertation = null;
			if (color.equals("red")) {
				xPertation = "sports car";
			} else if (color.equals("orange")) {
				xPertation = "private jet";
			} else if (color.equals("yellow")) {
				xPertation = "sad wagon";
			} else if (color.equals("green")) {
				xPertation = "motorcycle";
			} else if (color.equals("blue")) {
				xPertation = "train";
			} else if (color.equals("indigo")) {
				xPertation = "millenium falcon";
			} else if (color == "violet") {
				xPertation = "bicycle";
			}

			String retireMoney = null;
			String firstLetter = birthMonth.substring(0, 1);
			String secondLetter = birthMonth.substring(1, 2);		
			String thirdLetter = birthMonth.substring(2, 3);		
			if (firstName.contains(firstLetter) || lastName.contains(firstLetter)) {
				retireMoney = "1,000,000";
			} else if (firstName.contains(secondLetter) || lastName.contains(secondLetter)) {
				retireMoney = "10,000,000";
			} else if (firstName.contains(thirdLetter) || lastName.contains(thirdLetter)) {
				retireMoney = "1,000,000,000";
			} else {
				retireMoney = "100,000,000";
			}

			// Part 3 Print Fortune
			System.out.println(firstName + " " + lastName + " " + "will retire in" + " " + retireAge + " " + "years"
					+ " " + "with" + " " + retireMoney + " " + "dollars in the bank, a vacation home in" + " "
					+ geoLocation + " " + "and a" + " " + xPertation + ".");
			System.out.println("Would you like to have your fortune told again? yes/no");
			reFortune = scanner.next();
			reFortune = reFortune.toLowerCase();

		} while (reFortune.equals("yes"));
		scanner.close();
	}
}
