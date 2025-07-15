import java.util.Arrays;
import java.util.Scanner;

public class SortHalfArray {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int[] array = {3,7,8,1,6,11,61}; // Example array
       System.out.println("Tanvi Hingankar, 23be0674");
	

        sortHalfArray(array);
        System.out.println("Sorted half array: " + Arrays.toString(array));
    }

    public static void sortHalfArray(int[] array) {
        int length = array.length;
        int mid = length / 2;

        // Sort first half in ascending order
        Arrays.sort(array, 0, mid);

        // Sort second half in descending order
        for (int i = mid, j = length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
