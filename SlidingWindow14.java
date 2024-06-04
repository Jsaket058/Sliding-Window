//Number of substring containing all three characters.
//optimized
import java.util.*;
class SlidingWindow14{
    static int NoOfSubstring(String s,int n){
      HashMap<Character,Integer> mpp =new HashMap<>();
      int left=0,right=0,count=0;
      while(right < n && left < n){
        mpp.put(s.charAt(right),mpp.getOrDefault(s.charAt(right),0)+1);
        if(mpp.size()==3){
            count+=n-right;
            mpp.put(s.charAt(left),mpp.get(s.charAt(left))-1);
            if(mpp.get(s.charAt(left))==0)mpp.remove(s.charAt(left));
            left++;
            mpp.put(s.charAt(right),mpp.get(s.charAt(right))-1);
            if(mpp.get(s.charAt(right))==0)mpp.remove(s.charAt(right));
            continue;
        }
        right++;
      }
      return count;
      }

    public static void main(String[] args){
      String s="bbacba";
      System.out.println(NoOfSubstring(s,s.length()));
      }
}