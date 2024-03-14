package com.learning.core.day9;
import java.util.Scanner;
public class D09P02 {
	public static void merge(int[] arr, int left, int middle, int right) {
        int n = middle - left + 1;
        int m = right - middle;    
        int[] L = new int[n];
        int[] R = new int[m];
        
        for (int i = 0; i < n; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < m; ++j)
            R[j] = arr[middle + 1 + j];  
        int i = 0, j = 0;  
        int k = left;
        while (i < n && j < m)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }       
        while (i < n) {
            arr[k] = L[i];
            i++;
            k++;
        }       
        while (j < m) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }	
	public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;           
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);           
            merge(arr, left, middle, right);
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size: ");
        int n = sc.nextInt();     
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }  
        mergeSort(arr, 0, n - 1);     
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
        }
}


