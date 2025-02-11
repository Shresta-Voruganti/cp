import java.util.*;

public class ap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxFruits(arr, n));
        sc.close();
    }

    public static int maxFruits(int[] arr, int n) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int count = 0;
        int left = 0;
        for(int right = 0; right < n; right++) {
            hmap.put(arr[right], hmap.getOrDefault(arr[right], 0) + 1);

            while(hmap.size() > 2) {
                if(hmap.get(arr[left]) == 1) {
                    hmap.remove(arr[left]);
                }
                else {
                    hmap.put(arr[left], hmap.get(arr[left]) - 1);
                }
                left++;
            }
            count = Math.max(count, right - left + 1);
        }

        return count;
    }
}
