import java.util.*;

public class ap16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sorting(n, arr)));
        sc.close();
    }

    public static int[] sorting(int n, int[] arr) {
	if(arr == null || n == 0) {
            return new int[]{0};
        }
        if(n == 1) {
            return arr;
        }

        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            res[i] = arr[i];
        }
        int i = 0;
        int j = i + 1;
        while(i < n - 1) {
            if(res[i] < res[j]) {
                int temp = res[i];
                res[i] = res[j];
                res[j] = temp;
            }
            i++;
            j++;
        }

        int left = 0;
        int right = n - 1;
        while(left < right) {
            int temp = res[left];
            res[left] = res[right];
            res[right] = temp;

            left++;
            right--;
        }

        return res;
    }
}
