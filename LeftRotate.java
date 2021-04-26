package array;

public class LeftRotate {

	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	int[] newArray;
	newArray = rotate(arr,2);//rotates array n times, logic remains the same
	for(int item: newArray)
	System.out.print(item +" ");

	}

	private static int[] rotate(int[] arr,int n) {
		for(int j=0;j<n;j++) {
		int first =arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1] =first;
		
	}
		return arr;

}
}
