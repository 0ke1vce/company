package com.company;
public class sortingInJava {
    //this will print my array
        static void printArray(int Array[]){
                for(int i=0;i<Array.length;i++){
                    System.out.print(Array[i]+" ");
                }
        }

    public static void main(String[] args) {
      
        // Bubble sort 
        /*
        check adjacent element and move element at last
        e.g-  [7,8,3,1,2]
     1-   [7,3,1,2,8]    <-- first checking for 8 as 8>7
     2-   [3,1,2,7,8]  <--then checking for 7 as 7>3
     3- [1,2,3,7,8]  <-- then checking for 3 as 3>2  
     4- [1,2,3,7,8]  <--- as 1,2 are already sorted
so we used loops (n-1)times.
         */
        int arr[]={7,8,3,1,2};
        //bubble sort
        //time complexity ---> O(n^2)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){   //jitne element ghatane hai uske eqivalent -i kar diya
                if(arr[j]>arr[j+1]){    
//swap Normal method
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
    printArray(arr);

    }
}
