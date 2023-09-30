package array;

import java.util.Scanner;
//write a function that print all the elements of a given array
public class FunctionPrintArray {

	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;++i) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();//5 elements we can scan
		int arr[] = new int[n];
		for(int i=0;i<n;++i) {
		arr[i] = sc.nextInt();
		}
		printArray(arr);
	
		
		
		
		
		
	}
}
