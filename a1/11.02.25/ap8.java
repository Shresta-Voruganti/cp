import java.util.*;

public class ap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = 3;
        System.out.println(countGoodStrings(str, k));
        sc.close();
    }

    public static int countGoodStrings(String str, int k) {
        int count = 0;
        Map<Character, Integer> hmap = new HashMap<>();

        for(int i = 0; i < k; i++) {
            hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i), 0) + 1);
        }
        if(hmap.size() == k) {
            count++;
        }

        for(int i = k; i < str.length(); i++) {
            char outEle = str.charAt(i - k);
            if(hmap.get(outEle) == 1) {
                hmap.remove(outEle);
            }
            else {
                hmap.put(outEle, hmap.get(outEle) - 1);
            }
            char inEle = str.charAt(i);
            hmap.put(inEle, hmap.getOrDefault(inEle, 0) + 1);

            if(hmap.size() == k) {
                count++;
            }
        }
        return count;
    }
}
