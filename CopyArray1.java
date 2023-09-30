package array;

public class CopyArray1 {

	public static int[] solve(int arr[], int B) {

		int result[] = new int[5];

		for (int i = 0; i < arr.length; ++i) {

			arr[i] = arr[i] + B;
		}

		for (int i = 0; i < arr.length; ++i) {
			result[i] = arr[i];
			System.out.print(result[i] + " ");
		}
		return result;
	}

	public static void main(String args[]) {
		int arr[] = { 1,2,3,2,1 };

		int B = 3;

		// passing array to method m1
		solve(arr, B);
	}
}
