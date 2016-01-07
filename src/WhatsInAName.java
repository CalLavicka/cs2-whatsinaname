import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class WhatsInAName {

	public static void main(String[] args) {


		// TODO Auto-generated method stub

		//middle name random

		//shuffle

		//something else
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char [] name = s.toCharArray();

			
		//print shuffle array
		System.out.println(shuffleArray(name));
		
		//print uppercase name
		convertUppercase(name);
		
	   //print middle name
	   printArray(returnMiddleName(name));
	


	}

	// Grace

	static int consonantFrequency(char[] array, char consonant) {
		return 0;
	}

	static boolean lastnameHyphen(char[] array) {
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
