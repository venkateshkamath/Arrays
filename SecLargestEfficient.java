package array;

public class SecLargestEfficient {

	public static void main(String[] args) {
		int[] arr  = {12,12,12,9};
	int n = SecLargest(arr);
	if(n!=-1)
	System.out.println("Second Largest element is "+arr[n]+ " at index " +n);
	else
		System.out.println("No second largest element found");

	}
	static int SecLargest(int arr[]) {
		int res = -1, largest =0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[largest]) {
				res = largest;
			    largest = i;
			}
			    else if(arr[i]!=arr[largest]) {
			    if(res==-1 || arr[i]>arr[res])
			    		res = i;
			    }
		}
		return res;
		
	}

}
