import java.util.*;

public class sp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxsubk(arr, n, k));
        sc.close();
    }

    public static List<Integer> maxsubk(int[] arr, int n, int k) {
        List<Integer> result = new ArrayList<>();
        List<Integer> calc = new ArrayList<>();

        for(int i = 0; i < k; i++) {
            calc.add(arr[i]);
        }
        result.add(Collections.max(calc));

        for(int i = k; i < n; i++) {
            calc.remove(0);
            calc.add(arr[i]);
            result.add(Collections.max(calc));
        }

        return result;
    }
}
