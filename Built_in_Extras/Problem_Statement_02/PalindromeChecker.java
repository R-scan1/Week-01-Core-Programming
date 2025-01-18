import java.util.Scanner;

class Palindrome{
      boolean isPalindrome(String text){
        String temp="";
        for(int i=text.length()-1;i>=0;i--){
            temp+=text.charAt(i);
        }
        return temp.equals(text);
      }

      void display(boolean result){
        System.out.println("Is string a palindrome : "+result);
      }
}

public class PalindromeChecker {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      Palindrome palindrome=new Palindrome();
      System.out.println("Enter the string : ");
      String text=input.next();
      boolean result =palindrome.isPalindrome(text);
      palindrome.display(result);
      input.close();
    }
   
}
