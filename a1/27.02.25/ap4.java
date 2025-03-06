import java.util.*;

public class ap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(minops(str));
        sc.close();
    }

    public static int minops(String s) {
        // Stack<Character> stack = new Stack<>();
        int c = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                // stack.push(s.charAt(i));
                c++;
            }
            else {
                if(i < s.length() - 1 && s.charAt(i + 1) == ')') {
                    i++;
                }
                else {
                    ans++;
                }

                // if(stack.isEmpty()) 
                if(c == 0) {
                    ans++;
                }
                else {
                    // stack.pop();
                    c--;
                }
            }
        }

        // ans += stack.size() * 2;
        ans += c * 2;

        return ans;
    }
}
