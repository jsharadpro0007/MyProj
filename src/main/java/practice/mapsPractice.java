package practice;

import java.util.HashMap;
import java.util.Map;

public class mapsPractice {

    public static void main(String args[])
    {
        Map<String, String> testMap = new HashMap<>();

        testMap.put("1","abc");
        testMap.put("2","xyz");
        testMap.put("3","test");
        testMap.put("4","zest");

        testMap.remove("2");

        System.out.println(testMap);

        for(String m:testMap.keySet())
        {
            System.out.println(m+" "+testMap.get(m));
        }

        for(Map.Entry m : testMap.entrySet() )
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }



    }
}
