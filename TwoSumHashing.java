package array;

import java.util.HashMap;
import java.util.Map;
// Solution of TWOSUM using Hashing
public class TwoSumHashing {

	public static void main(String[] args) {
		int nums[] = {1,3,7,9,2};
		int target = 11;
		int[] result=twoSum(nums,target);
		
		for(int i=0;i<result.length;i++) {
			
			System.out.print(" "+result[i]);// Individual element
		}
	}
	public static int[] twoSum(int[] nums,int target) {
		Map<Integer,Integer> numMap = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int numToFind =  target - nums[i];

			if(numMap.containsKey(numToFind)) {
				return new int[]{numMap.get(numToFind),i};// Gives the index of that key with the present value of i 
			}
	
			numMap.put(nums[i],i);
		}
	
	return new int[] {};
	}
}


//public int[] twoSum(int[] nums, int target) {
//    Map<Integer,Integer> map = new HashMap<>();
//    for(int i=0;i<nums.length;i++){
//        
//        if(map.containsKey(target-nums[i]))
//            return new int[]{map.get(target-nums[i]),i};
//        map.put(nums[i],i);
//    }
//    return new int[]{};