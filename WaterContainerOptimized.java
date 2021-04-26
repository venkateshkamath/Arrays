package array;

public class WaterContainerOptimized {

	public static void main(String[] args) {
		int[] array= {1,8,6,2,5,8,3,7};
		int result=maxArea(array);
		System.out.println(result);

	}

	private static int maxArea(int[] array) {
		int area=0,p1=0,p2=array.length-1;

		while(p1<p2) {
			// When p1 is less than p2, I run this loop, that is p1 crosses p2 index values
			int current=Math.min(array[p1], array[p2])*(p2-p1);
			area=Math.max(area, current);
			if(array[p1]<=array[p2])
				p1++;// If element 6<8, pointer p1 goes from 0 to 1 for comparison
			else
			p2--;// 8<9 so pointer p2 comes inwards, WE ARE CONCERNED WITH THE MIN VALUE.
		}
		return area;
	}

}


//Time Complexity:O(n)
//Space Complexity:O(1)