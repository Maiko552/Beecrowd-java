package desafio;

import java.util.Arrays;

public class Anagrama {
    public static boolean isAnagram(String s, String t) {
        char[] sInArr = s.toCharArray();
        char[] tInArr = t.toCharArray();

        Arrays.sort(sInArr);
        Arrays.sort(tInArr);

        return Arrays.equals(sInArr, tInArr);
    }

    public static void main(String[] args) {
        String s = "ppk";
        String t = "alo";

        System.out.println(Anagrama.isAnagram(s, t));
    }
}
