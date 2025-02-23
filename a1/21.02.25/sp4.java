import java.util.*;

public class sp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(encode(n));
        sc.close();
    }

    public static String encode(int n) {
        int x = n + 1;
        StringBuilder sb = new StringBuilder();
        while(x > 0) {
            sb.append((x & 1));
            x = x >> 1;
        }
        sb.reverse();
        String s = sb.toString();

        return s.substring(1);
    }
}
