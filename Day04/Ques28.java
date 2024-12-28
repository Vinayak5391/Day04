public class Ques28 {
    public static void main(String[] args) {
          int[] array = {1, -2, 3, -4, 5};

          for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;    
				}
        }

        
        System.out.print("Updated Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}


/*Question 27: Replace Negative Numbers with Zero.

 Write a program to replace all negative numbers in the array 
 {1, -2, 3, -4, 5} with 0.
 Example: Resulting array should be {1, 0, 3, 0, 5}.*/