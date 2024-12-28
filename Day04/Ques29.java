public class Ques29 {
	public static void printArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static int[] replaceWithSum(int[] a) {
		int[] res = new int[a.length];
		for(int i = 0;i<a.length;i++) {
			if(i==0) {
				res[i] = a[i+1];
			}else if(i==a.length-1) {
				res[i] = a[i-1];
			}else {
				res[i] = a[i-1] + a[i+1];
			}
		}
		return res;
	}
	
  	public static void main(String[] args) {
                   int[] arr = {1, 2, 3, 4, 5};
                   int[] res = replaceWithSum(arr);
		   printArray(res);
             }
      }


/*Question 28: Replace Elements with the Sum of Neighbors
 Write a program to replace each element in an array {1, 2, 3, 4, 5} 
 with the sum of its neighbors.
 Example: Resulting array should be {2, 4, 6, 8, 4}.*/