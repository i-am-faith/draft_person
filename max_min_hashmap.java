import java.util.*;

public class max_min_hashmap {
    public static void main(String args[]) {
        // Sample array
        int[] arr = {5, 2, 3, 5, 2, 5, 6, 3, 3, 3};

        // HashMap to store frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        // Find max frequency element
        int maxFreq = Integer.MIN_VALUE;
        int maxFreqElement = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int freq = frequencyMap.get(num);
            maxFreq = Math.max(maxFreq, freq);
            if (freq == maxFreq && num < maxFreqElement) {
                maxFreqElement = num;
            }
        }


        // Find min frequency element
        int minFreq = Integer.MAX_VALUE;
        int minFreqElement = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int freq = frequencyMap.get(num);
            minFreq = Math.min(minFreq, freq);
            if (freq == minFreq && num < minFreqElement) {
                minFreqElement = num;
            }
        }

        System.out.println("Element with maximum frequency: " + maxFreqElement + " Frequency: " + maxFreq);
        System.out.println("Element with minimum frequency: " + minFreqElement + " Frequency: " + minFreq);
    }
}
