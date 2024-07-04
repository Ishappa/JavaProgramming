package Assignments;


public class PairsSumArray {
    public static void findPairs(int[] nums, int targetSum) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetSum) {
                    System.out.println("(" + nums[i] + ", " + nums[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 5, 6, -2, 8, 7};
        int targetSum = 6;

        System.out.println("Pairs with sum " + targetSum + ":");
        findPairs(nums, targetSum);
        
    }
}

