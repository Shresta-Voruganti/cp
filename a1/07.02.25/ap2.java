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
        Map<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < k; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);

            if(hmap.get(arr[i]) > 1) {
                return true;
            }
        }

        for(int i = k; i < n; i++) {
            int outEle = arr[i - k];
            if(hmap.get(outEle) == 1) {
                hmap.remove(outEle);
            }
            else {
                hmap.put(outEle, hmap.get(outEle) - 1);
            }
            int inEle = arr[i];
            hmap.put(inEle, hmap.getOrDefault(inEle, 0) + 1);

            if(hmap.get(arr[i]) > 1) {
                return true;
            }
        }

        return false;
    }
}
