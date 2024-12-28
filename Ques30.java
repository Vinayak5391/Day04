public class Ques30
	{
    public static void main(String[] args) {
 int[] array = {1, 2, 3, 4, 5};

          if (array.length > 1) {
              int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }

          System.out.print("Updated Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

/*Write a program to swap the 1st and last elements of the 
 array {1, 2, 3, 4, 5}.
 Example: Resulting array should be {5, 2, 3, 4, 1}.*/