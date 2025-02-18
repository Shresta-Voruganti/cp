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
        final int refA = capA;
        final int refB = capB;

//        while(an <= n/2 && be >= n/2)
        while(an <= be) {
            if(an == be) {
                if(capA >= capB && capA >= guests[an]) {
                    capA -= guests[an];
                    an++;
                }
                else if(capB >= capA && capB >= guests[be]) {
                    capB -= guests[be];
                    be--;
                }
//                else if(capA < guests[an] && capB < guests[be])
                else {
                    capA = refA;
                    capB = refB;
                    if(capA > capB) {
                        capA -= guests[an];
                        an++;
                    }
                    else {
                        capB -= guests[be];
                        be--;
                    }
                    refills++;
                }
            }
            if(capA >= guests[an]) {
                capA -= guests[an];
                an++;
            }
            else {
                capA = refA;
                capA -= guests[an];
                an++;
                refills++;
            }
            if(capB >= guests[be]) {
                capB -= guests[be];
                be--;
            }
            else {
                capB = refB;
                capB -= guests[be];
                be--;
                refills++;
            }
        }

        return refills;
    }
}
