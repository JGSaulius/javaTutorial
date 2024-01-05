package BinarySearch;
import java.util.Scanner;

class BinarySearch{

        static void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for(int i=0; i < 1; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }


        public static void main(String[] args) {
            int arr[] ={4, 2, 6, 1, 3};

            System.out.println("Array Before Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            bubbleSort(arr);//sorting array elements using bubble sort

            System.out.println("Array After Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        }
    }
