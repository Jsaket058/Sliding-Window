class SlidingWindow3{
	static int maxLength(int nums[],int k){
		int l=0,r=0,sum=0,maxLen=0;
		while(r<nums.length){
			sum=sum+nums[r];
			if(sum>k){
				sum=sum-nums[l];
				l++;
			}
			if(sum<=k){
				maxLen=Math.max(maxLen,r-l+1);
			}
			r++;
		}
		return maxLen;
	}
	public static void main(String[] args){
		int arr[]={2,5,1,10,10};
		System.out.println(maxLength(arr,14));
	}
}