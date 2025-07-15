public class RemoveNonAlphabetic {
    public static void main(String[] args) {
        String originalString = "Hello123 World!"; // Example string
        String resultString = removeNonAlphabetic(originalString);
        System.out.println("Original string: " + originalString);
        System.out.println("String with only alphabetic characters: " + resultString);
    }

    public static String removeNonAlphabetic(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            // Append only alphabetic characters
            if (Character.isLetter(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
