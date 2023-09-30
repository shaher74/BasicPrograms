package array;

public class CopyArray {
	
	public static void main(String[] args) {
		
		int[] A = {1,2,3,2,1};
		
		int result[] = new int[5];
		//int N = A.length;
		int B = 3;
		
		for(int i=0;i<A.length;++i) {
			
			A[i] = A[i]+B;
			
		}
		
		for(int i=0;i<A.length;++i) {
			result[i] = A[i]; 
			System.out.print(result[i] + " ");
		}
		
	}

//		public int[] solve(int arr[] ,int B) {
//		
//		int result[] = new int[5];
//		
//		B=3;
//		for(int i=0;i<arr.length;++i) {
//			
//			arr[i] = arr[i]+B;
//		}
//			
//		for(int i=0;i<arr.length;++i) {
//			result[i] = arr[i]; 
//			System.out.print(result[i] + " ");
//		}
//		return result;
//		}
//
//		
//		
		
		
	}


