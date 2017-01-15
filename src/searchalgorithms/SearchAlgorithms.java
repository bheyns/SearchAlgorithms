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
public class SearchAlgorithms {

    private static void bubbleSort(int input[]){
    boolean swopped = false; //optional
        for (int j = 0 ; j < input.length;j++){
            for (int i=0;i < (input.length -1);i++){
                if (input[i] > input[i+1]){
                    int temp = input[i];//swop values
                    input[i] = input[i+1];
                    input[i+1] = temp;
                    swopped = true;
                }
           }
           if(!swopped) //Optional
                break;  //Optional         
        }    
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list = {1,6,4,7,3,5,8,2,-1,0};
        int[] list2 = {1,4,7,3,5,2,-1,0,-2,-3,-4};
        int[] list3 = {1,5,4,8,3,9,7,14,24,32,2,11};
       bubbleSort(list);
        SelectionSort sort = new SelectionSort();
        insertionSort insSort = new insertionSort();
        quickSort qSort = new quickSort();
        
       
        
        
        int[] sortedlist = insSort.Sort(list);
        for(int a: list)
        {
            System.out.println(a);
        }
        
        
        
     
        sort.selectionSort(list2);
        for (int i = 0;i< list.length;i++){
            System.out.println(list[i]+ " ");
           System.out.println(list);
           System.out.println(list2);
        }
   //    selectionSort sort = new selectionSort();
       
    }

}


