package practice2;

public class test {

    public static void main(String args[])
    {

        String str = "Sharad Jadhav";

        String [] words = str.split(" ");
        String revString = "";
        for(String word:words) {
            String revWord = "";
            char temp [] = word.toCharArray();
            for (int i = word.length() - 1; i >= 0; i--) {
                revWord=revWord+temp[i];

            }

            revString = revString+revWord+" ";

        }

        System.out.println(revString);
    }
}
