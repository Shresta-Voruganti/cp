import java.util.*;

public class ap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int limit = sc.nextInt();
        System.out.println(minBoats(arr, n, limit));
        sc.close();
    }
    
    public static int minBoats(int[] arr, int n, int limit) {
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        int count = 0;
        
        while(left <= right) {
            if(arr[left] + arr[right] <= limit) { //pairing lightest person with heaviest person
                left++;
            }
            right--;
            count++;
        }
        
        return count;
    }
}
