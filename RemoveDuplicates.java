package array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Naive Approach
		int[] arr = { 10, 20, 20, 30, 30, 30 };
		System.out.println("Naive Approach");
		int res = remDupsNaive(arr);
		for (int i = 0; i < res; i++)
			System.out.println(arr[i]);

		System.out.println("Efficient Approach");
		int temp = remDupsEfficient(arr);
		for (int i = 0; i < temp; i++)
			System.out.println(arr[i]);

	}

	private static int remDupsEfficient(int[] arr) {

		// We use a single array over here. That is only one array.
		int temp = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[temp - 1] != arr[i]) {
				arr[temp] = arr[i];// If they aren't equal add arr[i] to arr[temp], then increment temp
				temp++;
			}
		}
		return temp;
	}

	static int remDupsNaive(int[] arr) {
		int[] temp = new int[arr.length];
		int res = 1;// There for comparision
		temp[0] = arr[0];// Because always the first element in an array will be unique.
		for (int i = 1; i < arr.length; i++) {
			if (temp[res - 1] != arr[i]) {
				// Initially temp[0]!=arr[1]
				temp[res] = arr[i];

				res++;
			}
		}
		for (int i = 0; i < res; i++) {
			arr[i] = temp[i];

		}
		return res;
	}
}
