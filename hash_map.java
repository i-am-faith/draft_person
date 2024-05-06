import java.util.*;

public class hash_map
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size = ");
        int n = sc.nextInt();
//        System.out.print("Enter number to get frequency = ");
//        int num = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> mpp = new HashMap<>();
        System.out.print("Enter elements = ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }

//        System.out.println("Frequency of " + num + "= " + mpp.get(num));



        // Find max and min frequency elements
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxFreqElement = -1;
        int minFreqElement = -1;

        // Simplified loop to find max and min frequency elements
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            int frequency = mpp.get(element);

            if (frequency > maxFreq) {
                maxFreq = frequency;
                maxFreqElement = element;
            }

            if (frequency < minFreq) {
                minFreq = frequency;
                minFreqElement = element;
            }
        }

        System.out.println("Element with maximum frequency: " + maxFreqElement + " Frequency: " + maxFreq);
        System.out.println("Element with minimum frequency: " + minFreqElement + " Frequency: " + minFreq);
    }
}






















