import java.util.*;

public class ap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] wall = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                wall[i][j] = sc.nextInt();
            }
        }
        System.out.println(distshapes(m, n, wall));
        sc.close();
    }
    static int[][] dirs = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    public static int distshapes(int m, int n, int[][] wall) {
//        int count = 0;
//        Queue<int[]> q = new LinkedList<>();
        Set<String> shapes = new HashSet<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(wall[i][j] == 1) {
                    List<int[]> shape = new ArrayList<>();
//                    count++;
//                    q.offer(new int[]{i, j});
//                    wall[i][j] = 0;
//                    bfs(i, j, wall, count, m, n);
                    bfs(i, j, wall, shape, m, n);
                    shapes.add(normalise(shape));
                }
            }
        }

//        return count;
        return shapes.size();
    }

//    public static void bfs(int i, int j, int[][] wall, int count, int m, int n)
    public static void bfs(int i, int j, int[][] wall, List<int[]> shape, int m, int n) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        wall[i][j] = 0;
        shape.add(new int[]{i, j});

        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];

            for(int[] dir : dirs) {
                int newx = x + dir[0];
                int newy = y + dir[1];

//                while(newx >= 0 && newx < m && newy >= 0 && newy < n && wall[newx][newy] == 1)
                if(newx >= 0 && newx < m && newy >= 0 && newy < n && wall[newx][newy] == 1) {
                    q.offer(new int[]{newx, newy});
                    wall[newx][newy] = 0;
//                    count = count + 1;
//                    bfs(newx, newy, wall, count, m, n);
                    shape.add(new int[]{newx, newy});
                }
            }
        }
    }

    public static String normalise(List<int[]> shape) {
        Collections.sort(shape, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int basex = shape.get(0)[0];
        int basey = shape.get(0)[1];

        StringBuilder sb = new StringBuilder();
        for(int[] point : shape) {
            sb.append((point[0] - basex)).append(",").append((point[1] - basey)).append(";");
        }

        return sb.toString();
    }
}
