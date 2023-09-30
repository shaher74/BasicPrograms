package array;

import java.util.ArrayList;
import java.util.List;

public class PositionOfB {
	
	public static int solve(ArrayList<Integer> A, int B) {
		int result = -1;
		for (int i = 0; i < A.size(); ++i) {
			if (A.get(i) == B) {
				//result = A.indexOf(i);
				result=i;				
			}
		}
		System.out.print(result);
		return result;
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(12);
		al.add(26);
		al.add(25);
		al.add(21);
		al.add(18);
		al.add(10);
		al.add(45);
		al.add(40);
		al.add(29);
		al.add(30);
		
		int B=40;
		
		solve( al, B);
		
//		
	}
}
