//Maximum consecutive ones where you can switch a max of k zeroes in order to get max length of cons 1.
class SlidingWindow7{
	static int maxConsecutiveOnesIII(int nums[],int k){
		int maxLen=0;
		for(int i=0;i<nums.length;i++){
			int zeroes=0;
			for(int j=i;j<nums.length;j++){
				if(nums[j]==0)zeroes++;
				if(zeroes<=k){
					int len=j-i+1;
					maxLen=Math.max(maxLen,len);
				}
				else break;
			}
		}
		return maxLen;
	}
	public static void main(String[] args){
		int arr[]={1,1,1,0,0,0,1,1,1,1,0};
		System.out.println(maxConsecutiveOnesIII(arr,2));
	}
}