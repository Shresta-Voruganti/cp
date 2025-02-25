import java.util.*;

public class ap29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(squares(arr, n));
        sc.close();
    }

    public static ArrayList<Integer> squares(int[] arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int left = 0;
        int right = n - 1;

        while(left <= right) {
            int l = Math.abs(arr[left]);
            int r = Math.abs(arr[right]);

            if(l < r) {
                // res.add(Math.pow(r, 2));
                res.add(r * r);
                right--;
            }
            else {
                // res.add(Math.pow(l, 2));
                res.add(l * l);
                left++;
            }
        }

        // Collections.sort(res);
        Collections.reverse(res);
        return res;
    }
}

