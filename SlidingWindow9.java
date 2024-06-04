//Maximum consecutive ones where you can switch a max of k zeroes in order to get max length of cons 1.
class SlidingWindow9{
	static int maxConsecutiveOnesIII(int nums[],int k){
		int maxLen=0,l=0,r=0,zeroes=0;
		while(r<nums.length){
			if(nums[r]==0)zeroes++;
			if(zeroes>k){
				if(nums[l]==0)zeroes--;
				l++;
			}
			if(zeroes<=k){
				int len=r-l+1;
				maxLen=Math.max(len,maxLen);
			}
			r++;
		}
		return maxLen;
		}
	public static void main(String[] args){
		int arr[]={1,1,1,0,0,0,1,1,1,1,0};
		System.out.println(maxConsecutiveOnesIII(arr,2));
	}
}