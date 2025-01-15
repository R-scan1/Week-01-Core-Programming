import java.util.Scanner;

public class TrimAndCompare {

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result+=text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string with leading and trailing spaces:");
        String text = input.nextLine();

        int[] trimIndexes = findTrimIndexes(text);
        String trimmedCustom = "";
        if (trimIndexes[0] != -1) {
            trimmedCustom = createSubstring(text, trimIndexes[0], trimIndexes[1]);
        }

        String trimmedBuiltIn = text.trim();

        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        System.out.println("Original String: "+ text );
        System.out.println("\nTrimmed String Custom Method:"+ trimmedCustom );
        System.out.println("\nTrimmed String Built-in Method:"+ trimmedBuiltIn);
        System.out.println("\nAre the trimmed strings equal? " + areEqual);

        input.close();
    }
}
