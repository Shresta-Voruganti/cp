import java.util.*;

public class sp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(checkpal(s));
        sc.close();
    }

    public static boolean checkpal(String s) {
        int n = s.length();
        int bm = 0;

        for(int i = 0; i < n; i++) {
            int val = s.charAt(i) - 'a';
            bm = bm ^ (1 << val);
        }

        if(bm == 0 || ((bm & (bm - 1)) == 0)) {
            return true;
        }
        return false;
    }
}
