# Not a Subset Sum – Greedy Approach (Java)

##  Problem Statement

Given a **sorted array** of positive integers, find the **smallest positive number** that **cannot be represented as the sum of elements of any subset** of the given array.

---

##  Approach

We use a **greedy algorithm** to solve this problem in **O(n)** time.

###  Idea:
We track the **smallest number (`res`) we cannot form yet**. Initially, `res = 1`.

For each element `arr[i]`:
- If `arr[i] > res`, it means we **cannot** form `res` using current or previous elements. So, return `res`.
- Otherwise, we add `arr[i]` to `res` to extend the range of numbers we can form.

This approach works because the array is sorted and we're always trying to build the smallest gap in the subset sum.

---

##  Example
arr = [1, 2, 3]

### Input:

### 🔁 Dry Run:
| Step | res | arr[i] | arr[i] > res? | res updated to |
|------|-----|--------|----------------|----------------|
| 1    | 1   | 1      | No             | 2              |
| 2    | 2   | 2      | No             | 4              |
| 3    | 4   | 3      | No             | 7              |
| End  |     |        |                | ✅ Return 7     |

---

## ⏱ Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)` (no extra space except a few variables)

---


