package array;

public class FrequesncyOfK {

	public static int frequency(int[] arr, int k ) {
		int count = 0;
		int n = arr.length;
		for(int i=0;i<n;++i) {
		//check for arr[i] is same as k
		if(arr[i]==k) {
			count++;
		}
		}
		return count; 
	}
		
	public static void main(String[] args) {
		int arr[] = {8,8,8,9,5,4};
		int B=8;
		frequency(arr,B);
	}
}
