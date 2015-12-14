
public class WhatsInAName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		for (int i = array.length -1; array[i] != ' '; i--) {
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
