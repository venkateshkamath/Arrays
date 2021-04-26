package array;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {10,16,71,14};
		System.out.println("Array After Reversal");
		int[] newArray = reverse(arr);
		for(int item: newArray)
			System.out.print(item + " ");

	}

	private static int[] reverse(int[] arr) {
		int temp, high=arr.length-1,low = 0;
		while(low<high) {
			temp = arr[low];
			arr[low] =arr[high];
			arr[high] = temp;
			++low;
			--high;
		}
		return arr;
	}

}
