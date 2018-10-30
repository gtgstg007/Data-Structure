package com.company.selectionsort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for(int i=intArray.length-1;i>0;i--){
            int largest=0;
            for(int j=1;j<=i;j++){
                if(intArray[largest]<intArray[j]){
                    largest=j;
                }

            }
            swap(intArray,largest,i);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}



