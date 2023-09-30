package array;

import java.util.Scanner;

public class storArray {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	//n=3
	int n = sc.nextInt();
	
	//it will create the array with size 3 and the default values  0 0 0
	int arr[] = new int[n];
	 
	for(int i=0;i<n;++i) {
		//taking the input one by one and storing in each index
		arr[i] = sc.nextInt();
		
	}
	//for printing
	for(int i=0;i<arr.length;++i) {
		//fetching the values in each element and printing the index
		System.out.print(arr[i]);
	}
	
}
}

