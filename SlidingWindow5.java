class SlidingWindow5{
	static int maxSubLenNoCharRep(char[] x){
		int hash[]=new int[256];
		int maxLen=0;
		for(int i=0;i<x.length;i++){
			for(int j=i;j<x.length;j++){
				if(hash[x[j]]==1)break;
				int len=j-i+1;
				maxLen=Math.max(maxLen,len);
				hash[x[j]]=1;
			}
		}
		return maxLen;
	}
	public static void main(String[] args){
		char x[]={'c','a','d','b','z','a','b','c','d'};
		System.out.println(maxSubLenNoCharRep(x));
	}
}