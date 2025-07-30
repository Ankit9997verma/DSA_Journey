public class RubySecondHouse {
    public int minCost(int[][] costs) {
        int n = costs.length;
        int k = costs[0].length;

        if (n == 0 || k == 0) return 0;

        int[][] dp = new int[n][k];

        // Initialize first row
        for (int j = 0; j < k; j++) {
            dp[0][j] = costs[0][j];
        }

        // Fill DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][j] = Integer.MAX_VALUE;

                for (int c = 0; c < k; c++) {
                    if (c != j) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][c] + costs[i][j]);
                    }
                }
            }
        }

        // Find min in last row
        int minCost = Integer.MAX_VALUE;
        for (int j = 0; j < k; j++) {
            minCost = Math.min(minCost, dp[n - 1][j]);
        }

        return minCost;
    }

    public static void main(String[] args) {
        int[][] costs = {
            {1, 5, 3},
            {2, 9, 4}
        };

        RubySecondHouse obj = new RubySecondHouse();
        System.out.println("Minimum painting cost: " + obj.minCost(costs)); // Output: 5
    }
}
