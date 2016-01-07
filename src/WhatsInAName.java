import java.util.Scanner;


public class WhatsInAName {

	public static void main(String[] args) {
		//grace menu bonus:
		Scanner scan = new Scanner(System.in);
		System.out.println("Whats yo name");
		String name = " ";
		name = scan.nextLine() ;
		name.toCharArray();
		char[] input = name.toCharArray();
		System.out.println("Welcome to the main menu: Select what you would like to do with your beautiful name! Type in the number that you want.");
		System.out.println("1. Reverse and display array 2. Determine the number of vowels. 3. Consonant frequency. 4. Return first name. 5. Return last name. 6. Return middle name(s) 7. Return boolean if last name contains a hyphen 8. Method to convert to lowercase 9. Method to convert to uppercase10. Modify array to create a random name (mix up letters) 11. Return boolean if first name is a palindrome");
		System.out.println("Type a number");
		String choice = " ";
		choice = scan.nextLine() ;
		if(choice.equals("3")) {
			String conchoice = " ";
			System.out.println("What consonant would you like to search for??");
			conchoice = scan.nextLine();
			conchoice.toCharArray();
			char[] coo = conchoice.toCharArray();
			System.out.println(consonantFrequency(input, coo[0] ));
		}
		if(choice.equals("7")) {
			System.out.println(lastnameHyphen(input));
		}
	}
	// Grace
	static int consonantFrequency(char[] array, char consonant) {
		int frequency = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == consonant) {
				frequency ++;
			}
		}
		return frequency;
	}
	static boolean lastnameHyphen(char[] array) {
		char hyphen = '-';
		for (int i = array.length -1; array[i] != ' ' && i>0; i--) {
			if(array[i] == hyphen) {
				return true;
			}
		}
		return false;
	}




	// Jocelyn
	static void convertLowercase(char[] array) {

	}

	static int numberVowels(char[] array) {
		return 0;
	}

	// Priya
	static void convertUppercase(char[] array) {

	}

	static void randomizeName(char[] array) {

	}

	static char[] returnMiddleName(char[] array) {
		return null;
	}

	// Sara
	static boolean firstNamePalindrome(char[] array) {
		return false;
	}

	static char[] returnFirstName(char[] array) {
		return null;
	}

	// Jason
	static char[] initialsFromName(char[] array) {
		return null;
	}

	static char[] returnLastName(char[] array) {
		return null;
	}

	static void reverseAndPrintArray(char[] array) {

	}
}
