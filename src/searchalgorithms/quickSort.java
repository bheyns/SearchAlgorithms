/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searchalgorithms;

/**
 *
 * @author DV2013-0499
 */
public class quickSort {
   
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
    }
    
    public static int partition(int[] a ,int low , int high) {
        int left = low;
        int right = high;
        int pivot = a[(low+high)/2];
        while(left <= right){
            while (left <= right && a[left] < pivot)
                left++;
            while (left <= right && a[right] > pivot)
                right--;
            if (left < right) {
                swap (a[left],a[right]);
                left++;
                right--;
            }
        }
        return left;
    }
    
    public static void quickSort(int[] a, int low,int high){
    if (low <= high){
        int pivotPosition = partition(a,low,high);
        if (low < pivotPosition - 1){
        quickSort(a,low , pivotPosition-1);
        }
        if (pivotPosition < high){
        quickSort(a,pivotPosition,high);
        }
        }
  
    }
    
    public static void print(int[] myArray){
        for (int i = 0;i< myArray.length;i++){
            System.out.println(myArray[i] + "");
        }
        System.out.println();
    }
}
