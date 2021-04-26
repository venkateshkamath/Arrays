/*
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
 * Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.

Example 1:

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.
 */
package array;

public class ContainWater {

	public static void main(String[] args) {
	int a[] = {7};
	System.out.println(maxArea(a));

	}

	private static int maxArea(int[] a) {

		int area = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				area = Math.max(area,Math.min(a[i], a[j])*(j-i) );// In one single step
		        
			}
		}
		return area;
	}
	

}
// Time Complexity:O(n^2)
// Space Complexity:O(1)
