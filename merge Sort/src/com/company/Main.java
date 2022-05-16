package com.company;

import java.util.Scanner;
class Sort{
    public void mergeSort(int numbers[]){
        int size = numbers.length;
        if(size<2){
            return;
        }
            int midIndex = numbers.length/2;
            int[] leftArray = new int[midIndex];
            int[] rightArray = new int[numbers.length - midIndex];
            for(int i=0;i<midIndex;i++){
                leftArray[i] = numbers[i];
            }
            for(int j=midIndex;j< numbers.length;j++){
                rightArray[j-midIndex] = numbers[j];
            }
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(numbers,leftArray,rightArray);

    }
    public void merge(int numbers[] , int leftArray[] , int rightArray[]){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i=0 , j=0, k=0;
        while(i < leftSize && j < rightSize){
            if(leftArray[i] <= rightArray[j]){
                numbers[k] = leftArray[i];
                i++;
            }
            else{
                numbers[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            numbers[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<rightSize){
            numbers[k] = rightArray[j];
            j++;
            k++;
        }

    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        Sort st = new Sort();
        st.mergeSort(numbers);
        for(int q:numbers){
            System.out.println(q);
        }
    }
}
