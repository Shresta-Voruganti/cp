import java.util.*;

public class ap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] values = new int[3];
        for(int i = 0; i < 3; i++) {
            values[i] = sc.nextInt();
        }
        int k = values[0];
        int lower = values[1];
        int upper = values[2];
        System.out.println(totPoints(arr, n, k, lower, upper));
        sc.close();
    }

    public static int totPoints(int[] arr, int n, int k, int lower, int upper) {
        int points = 0;
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if(sum < lower) {
            points--;
        }
        else if(sum > upper) {
            points++;
        }

        for(int i = k; i < n; i++) {
            int outEle = arr[i - k];
            sum -= outEle;
            int inEle = arr[i];
            sum += inEle;
            if(sum < lower) {
                points--;
            }
            else if(sum > upper) {
                points++;
            }
        }

        return points;
    }
}
