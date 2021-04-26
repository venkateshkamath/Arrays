package array;

public class MaxAndMin {

	public static void main(String[] args) {
	int	arr[]={50,25,36,10,123,1,75,-1};
	minMax(arr);
	}
	
	public static void minMax(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		
		}
		System.out.println("maximum element in the array is "+max );
		System.out.println("minimum element in the array is "+min );
		
	}

}


