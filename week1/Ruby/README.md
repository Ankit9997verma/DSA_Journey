# Ruby Second House 
###  Problem Statement:
Given a row of `n` houses and `k` available paint colors, paint each house such that:
- No two adjacent houses have the same color.
- Total cost is minimized.

###  Input:
- First line: `n` and `k`
- Next `n` lines: `k` integers representing painting cost for each color of that house.

###  Output:
- Minimum total painting cost following the rules.

---

###  Example:
Input:
2 3
1 5 3
2 9 4

Output:
5


---

###  Approach:
- Use **Dynamic Programming**.
- For each house and color, find the min cost from the previous row excluding the same color.

---

###  Time and Space Complexity:
- Time: `O(n * k^2)`
- Space: `O(n * k)`

---

###  Constraints:
- `1 <= n <= 100`
- `2 <= k <= 20`
- `1 <= costs[i][j] <= 20`

