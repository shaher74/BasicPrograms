package array;

import java.util.Scanner;

/*
 * Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.
 */
public class MaxArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();

		}
		int minVal = Integer.MAX_VALUE;
		int maxVal = Integer.MIN_VALUE;
		for (int i = 0; i < N; ++i) {
			minVal = Math.min(minVal, A[i]);
			maxVal = Math.max(maxVal, A[i]);

		}
		System.out.print(maxVal + " " + minVal);

	}
}