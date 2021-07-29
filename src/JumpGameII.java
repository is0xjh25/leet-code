/*
45.Jump Game II
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Your goal is to reach the last index in the minimum number of jumps.
You can assume that you can always reach the last index.

Yun-Chi Hsiao
Jul.29th.2021
 */

public class JumpGameII {

    public int jump(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            if (dp[i] == -1 || x == 0) {
                continue;
            } else {
                for (int j = i + 1; j <= i + x; j++) {

                    if (j >= n) {
                        break;
                    }

                    dp[j] = dp[j] == -1 ? dp[i] + 1 : Math.min(dp[j], dp[i] + 1);
                }
            }
        }

        return dp[n-1];
    }
}
