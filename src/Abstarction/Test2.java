package Abstarction;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1={20,32,43,21,300};
//        int[] arr2={20,300,32,43,21};
        int first=arr1[0];
        int second=arr1[1];

        for (int i=1;i<arr1.length;i++){

            if(arr1[i]>first){
                second=first;
                first=arr1[i];
            }
            else if (arr1[i]>second && arr1[i]!=first){
                second=arr1[i];
            }

        }
        System.out.println(second);
        }
    }

