package array;

public class TrappingRainEfficient {

	public static void main(String[] args) {
		int arr[] = {3,0,1,2,5};
		int n = arr.length;
		int water =getWater(arr,n);
		System.out.println(water);

	}

	private static int getWater(int[] arr, int n) {
	int res=0;
	int lmax[] = new int[n], rmax[]=new int[n];
	lmax[0] = arr[0];
	for(int i=1;i<n;i++) {
		lmax[i] = Math.max(arr[i], lmax[i-1]);
	}
	rmax[n-1] =arr[n-1];
	for(int i=n-2;i>=0;i--)
		rmax[i] =Math.max(arr[i],rmax[i+1]);
	for(int i=1;i<n;i++)
		res+=Math.min(lmax[i], rmax[i])-arr[i];
	return res;
	}

}
