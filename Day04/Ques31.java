public class Ques31 {
    public static void main(String[] args) {
          int[] array = {3, 1, 4, 5, 2};

         int maxIndex = 0;
        int minIndex = 0;

          for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i; // Update maxIndex if a larger element is found
            }
            if (array[i] < array[minIndex]) {
                minIndex = i; // Update minIndex if a smaller element is found
            }
        }

         int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

          System.out.print("Updated Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

/*Question 31: Swap Maximum and Minimum Elements
 Write a program to swap the maximum and minimum elements in an array 
 {3, 1, 4, 5, 2}.
 Example: Resulting array should be {3, 5, 4, 1, 2}.
 */