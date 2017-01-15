package searchalgorithms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DV2013-0499
 */
public class SelectionSort {
    
    public static void selectionSort(int[] list){
        int n = list.length;
        for (int i = 0;i < n;i++){
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i+1; j < n;j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    
}
