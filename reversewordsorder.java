import java.util.*;
public class ReverseWordsExample {
    public static void main(String[] args) {
        ReverseWordsExample example = new ReverseWordsExample();
        
        // Example input
        String input = "Hello World! Java is awesome.";

        // Call the reverseWords method
        String reversedWords = example.reverseWords(input);

        // Display the result
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversedWords);
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder(words.length);
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() != 0) {
                if (result.length() != 0) {
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }

        return result.toString();
    }
}
