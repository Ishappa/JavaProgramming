package Assignments;

public class MiddleIndex {

    public static int findMiddleIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1; // Handle empty or null arrays.
        }

        int totalSum = 0;
        for (int num : nums) {
//            System.out.println(num);
            totalSum += num;

        }
//        System.out.println("---------");
//        System.out.println(totalSum);

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i];

            if (leftSum == totalSum) {
                return i; // Found the middle index where both ends have equal sums.
            }

            leftSum += nums[i];
        }

        return -1; // No such index found.
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 2, 2,6};
        int middleIndex = findMiddleIndex(nums);

        if (middleIndex != -1) {
            System.out.println("Middle Index: " + middleIndex);
        } else {
            System.out.println("No middle index found.");
        }
    }
}

