import java.util.Scanner;

public class WhatsInAName {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		name = scan.nextLine();
		char[] input = name.toCharArray();
		
		boolean title = includesTitle(input);
			if(title == true) {
				System.out.println("You have a title!");
			}
			else {
				System.out.println("You do not have a title. You are not special. Be better. ");
			}
		
		
		System.out.println(numberVowels(input));
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
		for(int i=0;i < array.length; i++) {
			array[i] = Character.toLowerCase(array[i]);
		}
		
	}
	
	static int numberVowels(char[] array) {
		int numv = 0;
		for(int i=0;i < array.length; i++) {
			if(array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
				numv ++;
			}
		}
		return numv;
	}
	
	//BONUS: Return boolean if name contains a title/distinction (“Dr.”, “Sir”, “Esq”, “Ph.d”, "Madam,")
	
	
	

	
	
	
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
