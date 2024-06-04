//fruit into basket
import java.util.*;

class SlidingWindow11{
	static int fun(int nums[],int k){
		int l=0,r=0,maxlen=0;
		HashMap<Integer,Integer> mpp=new HashMap<>();
	    while(r<nums.length){
			mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
			if(mpp.size()>k){
					mpp.put(nums[l],mpp.get(nums[l])-1);
					if(mpp.get(nums[l])==0)mpp.remove(nums[l]);
					l++;
			}
			if(mpp.size()<=k){
				maxlen=Math.max(maxlen,r-l+1);
			}
			r++;
		}
		return maxlen;
	}
	public static void main(String[] args){
		int arr[]={3,3,3,1,2,1,1,2,4};
		System.out.println(fun(arr,2));
	}
}