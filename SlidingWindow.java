import java.util.*;
//brute force !!!!!!
class SlidingWindow{
	static ArrayList<ArrayList<Integer>> genAllSubArrays(int nums[]){
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		for(int i=0;i<nums.length;i++){
			for(int j=i;j<nums.length;j++){
			ArrayList<Integer> l1=new ArrayList<>();
				for(int k=i;k<=j;k++){
					l1.add(nums[k]);
				}
			ans.add(new ArrayList<>(l1));
			}
		}
		return ans;
	}
	public static void main(String[] args){
		int arr[]={1,2,3,4,5};
		ArrayList<ArrayList<Integer>> Yeah=genAllSubArrays(arr);
		for(ArrayList a:Yeah){
			for(Object x:a){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}