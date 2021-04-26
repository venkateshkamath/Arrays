package array;

public class TrappingRainWater {

	public static void main(String[] args) {
		int arr[] = {3,0,1,2,5};
		int n = arr.length;
		int water =getWater(arr,n);
		System.out.println(water);

	}
	public static int getWater(int[] arr, int n) {
		int res =0;
		for(int i=0;i<n-1;i++) {
			int lmax=arr[i];
			for(int j=0;j<i;j++)
				lmax = Math.max(arr[j], lmax);
			
			int rmax=arr[i];
			for(int j = i+1;j<n;j++)
				rmax=Math.max(arr[j], rmax);
			res+=Math.min(lmax, rmax)-arr[i];
		}
		
		return res;
	}

}
