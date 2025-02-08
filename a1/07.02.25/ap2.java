import java.util.*;

public class ap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(duplicateWindow(arr, n, k));
        sc.close();
    }

    public static boolean duplicateWindow(int[] arr, int n, int k) {
        Set<Integer> set1 = new HashSet<>();

        for(int i = 0; i < n; i++) {
            if(set1.contains(arr[i])) {
                return true;
            }
            set1.add(arr[i]);

            if(set1.size() > k) {
                set1.remove(arr[i - k]);
            }
        }

        return false;
    }
}
