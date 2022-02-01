package practice;

import java.util.HashMap;
import java.util.Set;

public class Practice {
    private void reverseString(String str) {
        char[] revStr = str.toCharArray();
        String revStr1 ="";
        for (int i = revStr.length - 1; i >= 0; i--) {
            System.out.print(revStr[i]);
            revStr1+=revStr[i];
        }
        System.out.println(revStr1);

    }

    private void findDupChars(String str) {

        try {
            char[] dupStr = str.toCharArray();
            for (int i = 0; i <= str.length() - 1; i++) {
                for (int j = i + 1; j <= str.length() - 1; j++) {
                    if (dupStr[i] == dupStr[j]) {
                        System.out.println("Duplicate Char" + dupStr[j]);
                        break;
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Supplied string is null");
        }
    }

    public void swapNumbers(int a, int b) {

        System.out.println("Before swapping" + a + "   " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping" + a + "   " + b);
    }

    // Check for number prime or not
    private void isPrime(int num) {

        int i, count = 0;

        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.print(num + " This is a Prime Number");
        } else {
            System.out.print(num + "This is not a Prime Number");
        }
    }

    public void dupCharWithOccurrences(String str)
    {
        char [] strArray = str.toCharArray();
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for(char c: strArray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c,charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c,1);
            }
        }

        Set<Character> chSet = charCountMap.keySet();

        System.out.println(charCountMap);

        for(char ch: chSet)
        {
            if(charCountMap.get(ch)>1)
            {
                System.out.println(ch+ "  "+ charCountMap.get(ch));
            }

        }

    }


    public static void main(String args[]) {
//        Practice practice = new Practice();
//        practice.reverseString("Reverse Me");
//        practice.findDupChars("abcd efgh abcd");
//        practice.dupCharWithOccurrences("aaaaaaa");
////        practice.swapNumbers(10, 20);
//        practice.isPrime(13);
        String s="abcd";
        s= s+"world";
        System.out.println(s);


    }
}
