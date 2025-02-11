import java.util.*;

public class ap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String blocks = sc.next();
        int k = sc.nextInt();
        System.out.println(minOps(blocks, k));
        sc.close();
    }

    public static int minOps(String str, int k) {
        if(k > str.length()) {
            return 0;
        }

        int bcount = 0;
        int wcount = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            if(str.charAt(i) == 'B') {
                bcount++;
            }
        }
        wcount = Math.min(wcount, k - bcount);
        for(int i = k; i < str.length(); i++) {
            int outEle = str.charAt(i - k);
            if(outEle == 'B') {
                bcount--;
            }

            int inEle = str.charAt(i);
            if(inEle == 'B') {
                bcount++;
            }
            wcount = Math.min(wcount, k - bcount);
        }

        return wcount;
    }
}
