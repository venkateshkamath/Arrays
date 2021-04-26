package array;

public class LargestInArray {

	public static void main(String[] args) {
		
		int arr[] = {105,0,17,20,1005};
		System.out.println(" naive approach "+naiveLargest(arr));// naive approach
		System.out.println("Efficient approach "+EfficientLargest(arr));// Efficient Approach
	}

	private static int EfficientLargest(int[] arr) {
		int large = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[large])// Time Complexity is o(n)
				large=i;
		}
		return large;
	}

	private static int naiveLargest(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean flag = true;
			for(int j=0;j<arr.length;j++) {//Time complexity because of 2 for loops is O(n^2)
				if(arr[i]<arr[j]) {
					flag=false;
					break;
				}
			}
			if(flag==true)
				return i;
		}
		return -1;
		
		
	}

}
