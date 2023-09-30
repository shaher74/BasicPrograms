package array;

import java.util.Scanner;
/*
 * With using INTEGER.MIN AND INTEGER.MAX
 */
public class MaxArraySecondAppoach {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int A[] = new int[N];
	for (int i = 0; i < N; ++i) {
		A[i] = sc.nextInt();

	}
	int minVal = A[0];
	int maxVal = A[0];
	for (int i = 1; i < N; ++i) {
		minVal = Math.min(minVal, A[i]);
		maxVal = Math.max(maxVal, A[i]);

	}
	System.out.print(maxVal + " " + minVal);

}

}
