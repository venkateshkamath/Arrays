package array;

public class Insertion {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] =10; arr[2]=120;arr[1]=20;
		int cap=arr.length,n=3, pos=3, x=6;
		int size=insert(arr,n,x,pos,cap);
	
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);

	}
	
	public static int insert(int arr[], int n, int x, int pos, int cap) {
		if(n==cap)
			return n;
		int idx=pos-1;
		for(int i=n-1;i>=idx;i--) 
	    arr[i+1] = arr[i];
	arr[idx] =x;
	return (n+1);
	}

}
