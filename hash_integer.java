import java.util.*;

public class hash_integer
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements = ");
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.print("Enter number to count frequency = ");
        int num = sc.nextInt();

        //preprocessing

        int[] hash = new int[max+1];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }


        System.out.println("Frequency = " + hash[num]);

    }
}

