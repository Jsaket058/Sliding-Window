//Maximum points you can obtain from cards
//Either pick up from the front or from the back , you cannot pick up from the front !! 

class SlidingWindow4{
	static int maxPoints(int nums[],int k){
		int lsum=0,rsum=0;
		for(int i=0;i<k;i++){
			lsum=lsum+nums[i];
		}
		int maxSum=lsum;
		int rightIndex=nums.length-1;
		for(int i=k-1;i>=0;i--){
			lsum-=nums[i];
			rsum+=nums[rightIndex];
			rightIndex--;
			maxSum=Math.max(maxSum,lsum+rsum);
		}
		return maxSum;
	}
	public static void main(String[] args){
		int arr[]={6,2,3,4,7,2,1,7,1};
		System.out.println(maxPoints(arr,4));
	}
}