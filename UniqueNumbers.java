import java.util.*;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 2, 4, 7, 8, 9, 4, 1, 3, 6, 9}; // Example array
        System.out.println("Original array: " + Arrays.toString(array));
        
        Set<Integer> uniqueNumbers = findUniqueNumbers(array);
        
        System.out.println("Unique numbers in the array: " + uniqueNumbers);
    }

    public static Set<Integer> findUniqueNumbers(int[] array) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();

        for (int num : array) {
            if (!duplicateNumbers.contains(num)) {
                if (!uniqueNumbers.contains(num)) {
                    uniqueNumbers.add(num);
                } else {
                    uniqueNumbers.remove(num);
                    duplicateNumbers.add(num);
                }
            }
        }

        return uniqueNumbers;
    }
}
