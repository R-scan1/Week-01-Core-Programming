import java.util.Scanner;

public class CharacterComparison {

    public static char[] getCharacters(String input) {
        char[] characters = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            characters[i] = input.charAt(i);
        }
        return characters;
    }

    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.next();

        char[] userDefinedChars = getCharacters(userInput);

        char[] builtInChars = userInput.toCharArray();

        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        System.out.println("Characters using user-defined method: " + new String(userDefinedChars));
        System.out.println("Characters using toCharArray(): " + new String(builtInChars));
        System.out.println("Are both arrays equal? " + areEqual);
		
		input.close();
    }
}