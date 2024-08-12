package Logical.Array;

public class LargestNumberArray {

    public static void main(String[] args) {
        int[] elements = { 12, 35, 78, 10, 98 };
        int largest = findLargest(elements);
        System.out.println("Largest number in the array: " + largest);
    }


    public static int findLargest(int[] arr) {
        int largest = arr[0];

        for(int i=0;i<arr.length;i++){
            if (largest<arr[i]) {
                largest=arr[i];
            }
        }
    return largest;
}



// for smallest number of elements
// public static void main(String[] args) {
//     int[] arr1 = {10,54,24,1,5};
//     int smallestNumber = smallestNumber(arr1);
//     System.out.println(smallestNumber);
     
// }
// public static int smallestNumber(int[] arr){
//     int smallNo = arr[0];
//     for(int i=0;i<arr.length;i++){
//         if(smallNo>arr[i]){
//         smallNo = arr[i];
//         }
//     }
//     return smallNo;
// }
}
