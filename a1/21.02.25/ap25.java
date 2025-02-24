import java.util.*;

public class ap25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(primeBits(n1, n2));
        sc.close();
    }

    public static int primeBits(int n1, int n2) {
        int n = n2 - n1 + 1;
        int[] res = new int[n];
        res[0] = n1;
        for(int i = 1; i < n; i++) {
            res[i] = res[i - 1] + 1;
        }
        int c = 0;
        for(int i = 0; i < n; i++) {
//            res[i] = Integer.bitCount(res[i]);
            res[i] = countBits(res[i]);
            if(checkprimes(res[i])) {
                c++;
            }
        }
        return c;
    }

    public static boolean checkprimes(int ele) {
        if(ele <= 1) return false;
        if(ele == 2 || ele == 3) return true;
        if((ele & 1) == 0) return false;

        for(int i = 3; i * i <= ele; i += 2) {
            if((ele % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countBits(int ele) {
        int count = 0;
        while(ele > 0) {
            if((ele & 1) == 1) {
                count++;
            }
            ele = ele >> 1;
        }
        return count;
    }
}
