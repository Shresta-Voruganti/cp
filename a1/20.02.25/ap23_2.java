import java.util.*;

public class ap23_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(hamd(n, arr));
        sc.close();
    }

    public static int hamd(int n, int[] arr) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int val = arr[i] ^ arr[j];
                sum += Integer.bitCount(val);
            }
        }

        return sum;
    }
}
