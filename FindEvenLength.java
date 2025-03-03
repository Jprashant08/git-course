import java.util.*;

class Solution
{
    public static void findLength(String str)
    {
        String[] words = str.split(" ");
        int[] len = new int[words.length];

        for(int i=0; i<words.length; i++)
        {
            len[i]=words[i].length();

        }
        for(int i=0; i<words.length; i++)
        {
            if(len[i]%2 == 0)
            {
                System.out.println(words[i]);
            }
        }
    }
}
public class FindEvenLength
{
    public static void main(String[] args)
    {
        Solution sl = new Solution();
        String str = "This approach uses dynamic programming to store the length of each word in an array, which can be reused in subsequent loops, reducing the overall number of calculations.";
        sl.findLength(str);
    }
}
