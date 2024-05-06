package Sorting;

import java.util.*;

public class merge_sort
{

    public static void merge(int[] arr,int l ,int mid,int r)
    {
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] a = new int[n1];
        int[] b= new int[n2];

        for(int i=0;i<n1;i++)
        {
            a[i] = arr[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            b[i] = arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2)
        {
            if(a[i] < b[j])
            {
                arr[k] = a[i];
                i++;
                k++;
            }
            else if(a[i] > b[j])
            {
                arr[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<n1)
        {
            arr[k] = a[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = b[j];
            j++;
            k++;
        }
    }


    public static void merge_sort_func(int[] arr,int l,int r)
    {
        int mid;
        if(l<r)
        {
            mid = l+(r-l)/2;
            merge_sort_func(arr,l,mid);
            merge_sort_func(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element = ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        merge_sort_func(arr,0,n-1);

        System.out.print("Your Sorted Array = ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}