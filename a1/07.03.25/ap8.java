import java.util.*;

public class ap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(binarysubString(s, k));
        sc.close();
    }

    public static boolean binarysubString(String s, int k) {
        // List<Integer> gll = new ArrayList<>();
        List<String> sgll = new ArrayList<>();

        generatecodes(k, sgll);

//        int n = gll.size();
//        for(int i = 0; i < n; i++) {
//            int ch = gll.get(i);
//            sgll.add(String.valueOf(ch));
//        }

        int n1 = sgll.size();
        for(int i = 0; i < n1; i++) {
            if(!isSubstr(sgll.get(i), s)) {
                return false;
            }
        }

        return true;
    }

    public static void generatecodes(int k, List<String> sgll) {
        int total = (int) Math.pow(2, k);

        for(int i = 0; i < total; i++) {
            String binary = String.format("%" + k + "s",  Integer.toBinaryString(i)).replace(' ', '0');
            sgll.add(binary);
        }
    }

    public static boolean isSubstr(String sub, String s) {
        if(s == null || sub == null) {
            return false;
        }

        return s.contains(sub);
    }
}
