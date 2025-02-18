import java.util.*;

public class ap18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for(int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        int n3 = sc.nextInt();
        int[] c = new int[n3];
        for(int i = 0; i < n3; i++) {
            c[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(minmaxExp(n1, n2, n3, a, b, c)));
        sc.close();
    }

    public static int[] minmaxExp(int n1, int n2, int n3, int[] a, int[] b, int[] c) {
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int i = 0, j = 0, k = 0;
        int[] res = new int[3];
        int mindiff = Integer.MAX_VALUE;

        while(i < n1 && j < n2 && k < n3) {
            int maxval = Math.max(a[i], Math.max(b[j], c[k]));
            int minval = Math.min(a[i], Math.min(b[j], c[k]));

            int diff = maxval - minval;

            if(diff < mindiff) {
                mindiff = diff;
                res[0] = a[i];
                res[1] = b[j];
                res[2] = c[k];
            }

            if(a[i] == minval) {
                i++;
            }
            else if(b[j] == minval) {
                j++;
            }
            else {
                k++;
            }
        }

        return res;
    }
}
