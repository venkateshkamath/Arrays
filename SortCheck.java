package array;

public class SortCheck {

	public static void main(String[] args) {
		int arr[] = {1,1,1};
		
	System.out.println(checkSort(arr));

	}

	static boolean checkSort(int[] arr) {
	
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]<arr[i]) 
				return false;
			
			
		}
		return true;
		
		
		
	}

}
