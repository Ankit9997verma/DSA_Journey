import java.util.*;

public class PartitionEqualSubsetSum {

    public static boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        
        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; 
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] input1 = {15, 5, 20, 10, 35, 15, 10};
        int[] input2 = {15, 5, 20, 10, 35};

        System.out.println(canPartition(input1)); 
        System.out.println(canPartition(input2)); 
    }
}
