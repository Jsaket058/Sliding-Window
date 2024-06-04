import java.util.*;
class SlidingWindow141 {
    static int NoOfSubstring(String s, int n) {
        int lSeen[] = new int[3];
        Arrays.fill(lSeen, -1);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            lSeen[s.charAt(i) - 'a'] = i;
            if (lSeen[0] != -1 && lSeen[1] != -1 && lSeen[2] != -1)
                ans += (1 + min(lSeen[0], lSeen[1], lSeen[2]));
        }
        return ans;
    }
    static int min(int a,int b,int c){
        return (a<b && a<c)?a:(b<a && b<c)?b:c;
    }
    public static void main(String[] args) {
        String s = "bbacba";
        System.out.println(NoOfSubstring(s, s.length()));
    }
}