import java.util.*;

public class ap23 {
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
        int left = 0;
        int right =  n - 1;
        int sum = 0;
//        ArrayList<int[]> al = new ArrayList<>();
        while(left < right) {
            int mid = left + 1;
            while(mid <= right) {
//                al.add(new int[]{arr[left], arr[mid]});
                sum += dist(arr[left], arr[mid]);
                mid++;
            }
            left++;
        }

//        int sum = 0;
//        for(int[] pair : al) {
//            sum += dist(pair[0], pair[1]);
//        }

        return sum;
    }

    public static int dist(int n1, int n2) {
        int count = 0;
        while(n1 > 0 || n2 > 0) {
            if((n1 & 1) != (n2 & 1)) {
                count++;
            }
            n1 = n1 >> 1;
            n2 = n2 >> 1;
        }

        return count;
    }
}
