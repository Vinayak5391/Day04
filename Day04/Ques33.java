class Ques33 
	{
    public static void main(String[] args) {
          int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

         int mergedLength = array1.length + array2.length;

          int[] mergedArray = new int[mergedLength];

         int i = 0, j = 0, k = 0;

         while (i < array1.length && j < array2.length) {
            mergedArray[k++] = array1[i++];
            mergedArray[k++] = array2[j++];
        }
  while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

          while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

         System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}

/*Question 33: Merge Two Arrays Alternately
 Write a program to merge two arrays {1, 2, 3} and {4, 5, 6}
 alternately.
 Example: Resulting array should be {1, 4, 2, 5, 3, 6}*/