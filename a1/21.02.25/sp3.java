import java.util.*;

public class sp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(flips(mat, m, n));
        sc.close();
    }

    public static boolean flips(int[][] mat, int m, int n) {
        for(int i = 1; i < m; i++) {
            mat[i][0] = mat[i][0] ^ mat[0][0];
            for(int j = 1; j < n; j++) {
                mat[i][j] = mat[i][j] ^ mat[0][j];
                if(mat[i][j] != mat[i][0]) {
                    return false;
                }
            }
        }
        return true;
    }
}
