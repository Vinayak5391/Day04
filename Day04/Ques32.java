import java.util.*;
class Ques32 
	{
	public static void printArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static int[] merge(int[] a, int [] b) {
		 int newLength = a.length+b.length;
		int[] res = new int[newLength]; 
		
		int index = 0;
		for(int x : a) {
			res[index] = x;
			index++;
		}
		for(int x : b) {
			res[index] = x;
			index++;
		}
               Arrays.sort(res);
		return res;
	}
      public static void main(String[] args) {
                   int[] a = {1,2,3};
                   int[] b = {3,4,5,6};
                   int[] res = merge(a,b);
 		   printArray(res);
                   
             }
      }
/*Question 32: Merge Two Sorted Arrays.

 Write a program to merge two sorted arrays {1, 3, 5} 
 and {2, 4, 6} into a single sorted array.
 Example: Resulting array should be {1, 2, 3, 4, 5, 6}.*/