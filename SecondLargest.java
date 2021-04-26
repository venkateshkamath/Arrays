package array;

public class SecondLargest {

	public static void main(String[] args) {
	int arr[] = {10,10,10,16};
	int n = secondLargest(arr);
	if(n!=-1)
	System.out.println("Second Largest element "+arr[n]+ " at index " +n);
	else
		System.out.println("No second largest element found");

	}

static int Largest(int[] arr) {
	  int largest  = 0;
	  for(int i=1;i<arr.length;i++) {
		  if(arr[i]>arr[largest])
			  largest = i;
	  }
		  
	  return largest;
  }

private static int secondLargest(int[] arr) {
		int largest = Largest(arr);// Largest index is got over here
		int result  = -1;// Initially set to -1
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[largest]) {// If it i == largest element, it ignores and does not go in
				if(result == -1)
					result = i;
				else if(arr[i]>arr[result])
					result=i;
			}
				
		}
		return result;
	}
}
