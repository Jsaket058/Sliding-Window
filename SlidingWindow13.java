import java.util.*;
class SlidingWindow13{
	static int longestSubstring(String s,int k){
		HashMap<Character,Integer> mpp=new HashMap<>();
		int left=0,right=0,maxlen=0;
		int n=s.length();
		while(right < n){
            mpp.put(s.charAt(right),mpp.getOrDefault(s.charAt(right),0)+1);
			if(mpp.size()>k){
				mpp.put(s.charAt(left),mpp.get(s.charAt(left))-1);
				if(mpp.get(s.charAt(left))==0)mpp.remove(s.charAt(left));
				left++;
			}
			if(mpp.size()<=k)maxlen=Math.max(maxlen,right-left+1);
			right++;
		}
		return maxlen;
	}
	public static void main(String[] args){
		String s="aaabbccd";
		System.out.println(longestSubstring(s, 2));
	}
}