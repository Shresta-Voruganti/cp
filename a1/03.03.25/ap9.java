import java.util.*;

public class ap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ops(n));
        sc.close();
    }

    public static int ops(int n) {
        int count = 0;

        while(n > 1) {
            if((n & 1) == 0) {
                n = n/2;
            }
            else {
                if((n == 3) || ((n & 2) == 0)) {
                    n--;
                }
                else {
                    n++;
                }
            }
            count++;
        }

        return count;
    }

//    public static int ops(int n) {
//        int n1 = n;
//        int n2 = n;
//        int count1 = 0;
//        int count2 = 0;
//
//        while(n1 > 1) {
//            if((n1 & 1) == 0) {
//                n1 = n1/2;
//            }
//            else {
//                n1 = n1 + 1;
//            }
//            count1++;
//        }
//
//        while(n2 > 1) {
//            if((n2 & 1) == 0) {
//                n2 = n2/2;
//            }
//            else {
//                n2 = n2 - 1;
//            }
//            count2++;
//        }
//
//        return Math.min(count1, count2);
//    }

}
