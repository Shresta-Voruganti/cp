import java.util.*;

public class ap28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int V = sc.nextInt();
        int[] screenplays = new int[n];
        for(int i = 0; i < n; i++) {
            screenplays[i] = sc.nextInt();
        }
        // int T = sc.nextInt();
        // int V = sc.nextInt();
        System.out.println(refill(n, screenplays, T, V));
        sc.close();
    }

    public static int refill(int n, int[] screenplays, int T, int V) {
        int trivi = 0;
        int vamshi = n - 1;
        int refills = 0;
        int refT = T;
        int refV = V;

        while(trivi <= vamshi) {
            if(trivi == vamshi) {
                if(refT >= screenplays[trivi]) {
                    refT -= screenplays[trivi];
                    trivi++;
                }
                else if(refV >= screenplays[vamshi]) {
                    refV -= screenplays[vamshi];
                    vamshi--;
                }
                else {
                    refT = T;
                    refV = V;
                    if(refT > refV) {
                        refT -= screenplays[trivi];
                        trivi++;
                    }
                    else {
                        refV -= screenplays[vamshi];
                        vamshi--;
                    }
                    refills++;
                }
            }
            else {
                if(refT >= screenplays[trivi]) {
                    refT -= screenplays[trivi];
                    trivi++;
                }
                else {
                    refT = T;
                    refT -= screenplays[trivi];
                    trivi++;
                    refills++;
                }
                if(refV >= screenplays[vamshi]) {
                    refV -= screenplays[vamshi];
                    vamshi--;
                }
                else {
                    refV = V;
                    refV -= screenplays[vamshi];
                    vamshi--;
                    refills++;
                }
            }
        }

        return refills;
    }
}
