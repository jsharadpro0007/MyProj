package practice2;

import java.util.HashMap;

public class dupStr {

    public static void main(String args[])
    {
        String str = "abddbbdd";
        char[] ch = str.toCharArray();
        boolean flag = true;

        HashMap <Character,Integer> hashMapCounter = new HashMap<>();

        for (char letter: ch)
        {
            if(hashMapCounter.containsKey(letter))
            {
                hashMapCounter.put(letter,hashMapCounter.get(letter)+1);
            }
            else
                hashMapCounter.put(letter,1);
        }
        System.out.println(hashMapCounter);
            }

}
