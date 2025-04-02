package lab11;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // i) Change the case of the string
        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();
        String changedCase = "";
        for (char c : str1.toCharArray()) {
            if (Character.isUpperCase(c))
                changedCase += Character.toLowerCase(c);
            else
                changedCase += Character.toUpperCase(c);
        }
        System.out.println("The string after changing the case is: " + changedCase);

        // ii) Reverse the string
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("The string after reversing is: " + reversed);

        // iii) Compare two strings
        System.out.print("\nEnter the second string for comparison: ");
        String str2 = sc.nextLine();
        int diff = str1.compareTo(str2);
        System.out.println("The difference between ASCII values is: " + diff);

        // iv) Insert one string into another string
        System.out.print("\nEnter the string to be inserted into first string: ");
        String str3 = sc.nextLine();
        String inserted = str1 + " " + str3;
        System.out.println("The string after insertion is: " + inserted);

        // v) Convert to uppercase and lowercase
        System.out.print("\nEnter a String: ");
        String str4 = sc.nextLine();
        System.out.println("Uppercase: " + str4.toUpperCase());
        System.out.println("Lowercase: " + str4.toLowerCase());

        // vi) Check if a character is present in string
        System.out.print("\nEnter a String: ");
        String str5 = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int position = str5.indexOf(ch);
        if (position != -1) {
            System.out.println("Position of entered character: " + position);
        } else {
            System.out.println("Entered character is not present");
        }

        // vii) Check palindrome
        System.out.print("\nEnter a String: ");
        sc.nextLine(); // to consume leftover newline
        String str6 = sc.nextLine();
        String revStr6 = new StringBuilder(str6).reverse().toString();
        if (str6.equals(revStr6)) {
            System.out.println("Entered string is palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }

        // viii) Count words, vowels, consonants
        System.out.print("\nEnter a String: ");
        String str7 = sc.nextLine();
        int wordCount = str7.trim().isEmpty() ? 0 : str7.trim().split("\\s+").length;
        int vowelCount = 0, consonantCount = 0;
        for (char c : str7.toCharArray()) {
            if (Character.isLetter(c)) {
                char lc = Character.toLowerCase(c);
                if ("aeiou".indexOf(lc) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("No. of words: " + wordCount);
        System.out.println("No. of vowels: " + vowelCount);
        System.out.println("No. of consonants: " + consonantCount);

        sc.close();
    }
}
