import java.util.*;

class Solution
{
    public static void findEvenLength(String str)
    {
        String[] w = str.split(" ");

        int[] len = new int[w.length];
    // Calculate the length of each word and store it into a array called len[]
        for(int i=0; i<w.length; i++)
        {
            len[i] = w[i].length();
        }
    // Find the length of each array is even or Odd
        for(int i=0; i<w.length; i++)
        {
            if(len[i] % 2 == 0)
            {
                System.out.println(w[i]);
            }
        }

    }            
}

public class EvenLengthString {
    public static void main(String args[])
    {

     String str="This is the first code to be commited on git-course repository";
     Solution.findEvenLength(str);               
    }
    
}
