import java.util.*;

public class hash_char
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string = ");
        String s = sc.next();
        System.out.print("Enter the char to get freq = ");
        char c = sc.next().charAt(0);

        //precompute
        int[] hash = new int[26];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)-'a']++;
        }

        System.out.println("Frequency = " + hash[c-'a']);

    }
}




















