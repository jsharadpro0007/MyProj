package practice2;
// Java program to find
// and print longest substring
// without repeating characters.
import java.util.*;
class test1{

    public static String getUniqueCharacterSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        return output;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "GEEKSFORGEEKS";
        System.out.print(getUniqueCharacterSubstring(str));
    }
}

// This code is contributed by divyeshrabadiya07