public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6}; // Example array with one missing number
        int n = 6; // Expected maximum value in the array (inclusive)
        
        int missingNumber = findMissingNumber(array, n);
        
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array, int n) {
        // Calculate the sum of all numbers up to n
        int totalSum = n * (n + 1) / 2;
        
        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        
        // The missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }
}
