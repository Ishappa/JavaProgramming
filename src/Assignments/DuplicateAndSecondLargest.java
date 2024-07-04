package Assignments;

import java.util.Scanner;

public class DuplicateAndSecondLargest {
    public static void main(String[] args) {

        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=ip.nextInt();

        System.out.println("Enter the elements of an array");
        int [] arr1 = new int[size];
       // int [] arr2 = new int[size];

        for(int i =0;i<arr1.length;i++){
            arr1[i]=ip.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
            int c=0;
            for(int j=i+1;j<arr1.length;j++ ){
                if(arr1[i]==arr1[j]){
                    c++;
                }
            }
            if(c==0) {
                System.out.println(arr1[i]);
            }
        }


        int n=arr1.length;
        int largest = arr1[0];
        int secondLargest = arr1[0];

        for (int i = 0; i < n; i++) {
            if (largest < arr1[i]   ) {

                secondLargest=largest;
                largest = arr1[i];

            } else if ( secondLargest< arr1[i] && arr1[i]!= largest) {
                secondLargest = arr1[i];
            }
        }

        System.out.println( "Second largest: "+secondLargest);
    }


    }

