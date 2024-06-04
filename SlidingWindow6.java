import java.util.*;
class SlidingWindow6{
    static int maxSubLenNoCharRep(char[] x){
		int l=0,r=0,maxLen=0,n=x.length;
		int hash[]=new int[256];
		Arrays.fill(hash,-1);
		while(r<n){
		if(hash[x[r]]!=-1){
			if(hash[x[r]]>=l){
				l=hash[x[r]]+1;
		    }
		}
        int len=r-l+1;
        maxLen=Math.max(maxLen,len);
        hash[x[r]]=r;
        r++;		
		}
		return maxLen;
	}
 
    public static void main(String[] args){
		char x[]={'c','a','d','b','z','a','b','c','d'};
		System.out.println(maxSubLenNoCharRep(x));		
	}
}