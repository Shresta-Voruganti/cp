import java.util.*;

public class ap15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] guests = new int[n];
        for(int i = 0; i < n; i++) {
            guests[i] = sc.nextInt();
        }
        int capA = sc.nextInt();
        int capB = sc.nextInt();
        System.out.println(refill(n, guests, capA, capB));
        sc.close();
    }

    public static int refill(int n, int[] guests, int capA, int capB) {
        int an = 0;
        int be = n - 1;
        int refills = 0;
        int refA = capA;
        int refB = capB;

//        while(an <= n/2 && be >= n/2)
        while(an <= be) {
            if(an == be) {
                if(refA >= guests[an]) {
                    refA -= guests[an];
                    an++;
                }
                else if(refB >= guests[be]) {
                    refB -= guests[be];
                    be--;
                }
//                else if(capA < guests[an] && capB < guests[be])
                else {
                    refA = capA;
                    refB = capB;
                    if(refA > refB) {
                        refA -= guests[an];
                        an++;
                    }
                    else {
                        refB -= guests[be];
                        be--;
                    }
                    refills++;
                }
            }
            else {
                if(refA >= guests[an]) {
                    refA -= guests[an];
                    an++;
                }
                else {
                    refA = capA;
                    refA -= guests[an];
                    an++;
                    refills++;
                }
                if(refB >= guests[be]) {
                    refB -= guests[be];
                    be--;
                }
                else {
                    refB = capB;
                    refB -= guests[be];
                    be--;
                    refills++;
                }
            }
        }

        return refills;
    }
}
