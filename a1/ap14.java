import java.util.*;

public class ap14 {
    static List<Character> vowelsList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverseVowels(str));
        sc.close();
    }

    public static String reverseVowels(String str) {
        if(str == null || str.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(!checkVowel(str.charAt(left))) {
                left++;
            }
            else if(!checkVowel(str.charAt(right))) {
                right--;
            }
            else {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);

                left++;
                right--;
            }
        }

        return sb.toString();
    }

    public static boolean checkVowel(char ch) {
//        if(vowelsList.contains(ch)) {
//            return true;
//        }
//        return false;
        return vowelsList.contains(ch);
    }
}
