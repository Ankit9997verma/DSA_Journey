
###  Approach:
- Use a **prefix sum + HashMap** to store frequency of cumulative sums.
- If `prefix_sum - k` exists, it means there's a subarray that sums to `k`.

### ⏱ Time and Space Complexity:
- Time: `O(n)`
- Space: `O(n)`

### Constraints:
- 1 <= nums.length <= 20,000  
- -1000 <= nums[i] <= 1000  
- -10^7 <= k <= 10^7
