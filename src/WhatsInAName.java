
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
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
		for (int i =0; i < array.length; i++) {
			Character.toUpperCase(array[i]);
			array[i] = Character.toUpperCase(array[i]);
		}
		
		System.out.println(array);
	}
		

	static char[] shuffleArray(char[] ar) 
	{


		Random rand = new Random();

		for (int i = ar.length - 1; i > 0; i--)

		{
			int index = rand.nextInt(i + 1);
			// Simple swap
			char a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;

		}

		return ar;
	}

	static char[] returnMiddleName(char[] array) {

		char[] middlename = new char[500];

		int min = 0;
		int max = 0;
		int counter = 0;

		for(int i=0; i < array.length; i++) {
			if (array[i] == ' ') {

				if(counter == 0){	
					min = i;

					counter++;
				}

				if(counter == 1){
					max= i;

				}
			}

		}


	for(int i=min; i<max; i++) {
		middlename[i] = array[i];
		

	}
	
	return middlename;


}

static void printArray(char[] array){
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]);
	}
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
