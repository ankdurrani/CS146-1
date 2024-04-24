// This is the HW1 problem done in java. Includes an example, so should be good to compile. Feel free to pull an issue request if you find anything

public class Palindrome {
    public static boolean isPalindrome(String s) {
        String convertS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return convertS.equals(new StringBuilder(convertS).reverse().toString());
    }

    public static void main(String[] args) {
        String s = "racecar o racecar";
        System.out.println(isPalindrome(s)); 
    }
}
