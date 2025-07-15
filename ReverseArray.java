import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
	System.out.println("Tanvi Hingankar, 23be0674");
        int[] originalArray = {5, 10, 3, 7, 8, 4}; // Example array
        System.out.println("Original array: " + Arrays.toString(originalArray));
        
        reverseArray(originalArray);
        
        System.out.println("Reversed array: " + Arrays.toString(originalArray));
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move left index to the right
            left++;

            // Move right index to the left
            right--;
        }
    }
}
