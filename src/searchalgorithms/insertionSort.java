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
public class insertionSort {

    public static int[] Sort(int[] list){
        for (int i = 0; i < list.length;i++){
            int currentElement = list[i];
            int k;
            for (k = i-1;k>= 0 && list[k] > currentElement;k--){
                list [k+1] = list[k];
                
            }
            list [k+1] = currentElement;
        }
        return list;
    }
}

