package practice;

import java.util.ArrayList;

public class practice2 {

    public static void main(String args[])
    {
        int n = 121;
        int temp = n;
        int revNum = 0;
        int remainder;
        while(n>0)
        {
            remainder=n%10;
            revNum=(revNum*10)+remainder;
            n=n/10;
        }
            System.out.println("reverse number"+revNum);
        if(temp==revNum)
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

        String str = "Hello World";
        String words [] = str.split(" ");

        for(String word:words) {

            String revStr = "";
            char[] str2 = word.toCharArray();
            for (int i = str2.length - 1; i >= 0; i--) {
                revStr += str2[i];
            }

            System.out.print(revStr);
            System.out.print(" ");
        }
    }
}
