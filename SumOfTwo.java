package array;


public class SumOfTwo {
	public static void main(String[] args) {
	int nums[] = {1,1,9},  target = 10;
	
	int[] result = twoSum(nums,target);
	for(int i=0;i<result.length;i++)
	System.out.print(" "+result[i]);// Individual element
		
	}	

	private static int[] twoSum(int[] nums, int target) {
		for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                 
                if(nums[j]==target-nums[i])
                   
                    return new int[] {i,j};
                
                    
            }
        }
        return null;
	}
}
