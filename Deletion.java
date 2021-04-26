package array;

public class Deletion {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		System.out.println("Array before deletion");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int x = 20;
		int newsize=delete(arr,x);
		System.out.println("\nArray after deletion");
		for(int i=0;i<newsize;i++)
			System.out.print(arr[i]+" ");

	}
	public static int delete(int arr[], int x) {
		int i;
		int n= arr.length;
		for(i=0;i<n;i++)
			if(arr[i] ==x )
				break;// we found the element and we are breaking, do not want to continue.
		if(n==i)
			return n;// we did not find the element, traversed throughout the array.
		for(int j=i;j<n-1;j++)//run the loop two times.
			arr[j]=arr[j+1];
		return (n-1);
		
	}

}
