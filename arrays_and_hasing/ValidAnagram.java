
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        String text1 = "";
        String text2 = "";

        Scanner sc = new Scanner(System.in);

        text1 = sc.next();
        text2 = sc.next();

        ValidAnagram validAnagram = new ValidAnagram();

        boolean res = validAnagram.isAnagram(text1, text2);
        if (res == true) {
            System.out.println("valid anagram");
        } else {
            System.out.println("not a valid anagram");
        }

        sc.close();

    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sFreq = new HashMap<Character, Integer>();
        Map<Character, Integer> tFreq = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            sFreq.put(c, sFreq.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        return tFreq.equals(sFreq);
    }
}
