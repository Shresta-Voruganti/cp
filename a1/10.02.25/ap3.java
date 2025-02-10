import java.util.*;

public class ap3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(distinctmax(arr, n, k));
        sc.close();
    }

    public static int distinctmax(int[] arr, int n, int k) 
    {
      
       if(k > n) {
           return 0;
        }
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> hmap = new HashMap<>();
        int sum  = 0;
        for(int i = 0; i < k; i++) 
        {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
        }
        if(hmap.size() == k) 
        {
            sum = sumh(hmap);
        }
        max = Math.max(sum, max);
        for(int i = k; i < n; i++) 
        {
            int outEle = arr[i - k];
            if(hmap.get(outEle) == 1) 
            {
                hmap.remove(outEle);
            }
            else 
            {
                hmap.put(outEle, hmap.get(outEle) - 1);
            }
            int inEle = arr[i];
            hmap.put(inEle, hmap.getOrDefault(inEle, 0) + 1);
            if(hmap.size() == k) 
            {
                sum = sumh(hmap);
            }
            max = Math.max(sum, max);
        }
        return max;
    }
    
    public static int sumh(Map<Integer, Integer> hmap) {
        int sum = 0;
        for(int val : hmap.keySet()) {
            sum += val;
        }
        return sum;
    }

}
