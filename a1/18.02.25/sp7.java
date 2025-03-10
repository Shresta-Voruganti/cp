import java.util.*;

public class sp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String abbr = sc.next();
        System.out.println(validabbr(word, abbr));
        sc.close();
    }

    public static boolean validabbr(String word, String abbr) {
        int i = 0;
        int j = 0;
        while(i < word.length() && j < abbr.length()) {
            if(word.charAt(i) == abbr.charAt(j)) {
                ++i;
                ++j;
                continue;
            }
            if(abbr.charAt(j) <= '0' || abbr.charAt(j) > '9') {
                return false;
            }
            int start = j;
            while(j < abbr.length() && abbr.charAt(j) > '0' && abbr.charAt(j) <= '9') {
                ++j;
            }
            int num = Integer.parseInt(abbr.substring(start, j));
            i += num;
        }

        return i == word.length() && j == abbr.length();
    }
}
