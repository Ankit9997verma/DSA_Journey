# Partition Equal Subset Sum

This project solves the **Partition Equal Subset Sum** problem — a variation of the classic **Subset Sum Problem**. The goal is to determine whether a given list of integers (which may contain duplicates) can be split into two subsets with equal sums.

---

## 🧩 Problem Statement

Given a multiset (array of non-negative integers), determine if it can be partitioned into two subsets such that:



### ➕ Example 1:
**Input:**  
`[15, 5, 20, 10, 35, 15, 10]`  
**Output:**  
`true`  
**Explanation:**  
Subset A: `[15, 5, 10, 15, 10]` → Sum = 55  
Subset B: `[20, 35]` → Sum = 55

### ➖ Example 2:
**Input:**  
`[15, 5, 20, 10, 35]`  
**Output:**  
`false`  
**Explanation:**  
Total sum is 85 → Cannot be split equally.

---

## ✅ Constraints

- All integers are non-negative
- At least one number is present
- The array can contain up to 100 elements

---

## 🚀 Approach

We use **dynamic programming (DP)** to solve the problem in an optimized way. If the total sum of the array is **even**, we check whether a subset exists whose sum is equal to `totalSum / 2`. If so, the remaining elements naturally sum to the other half.

### Time Complexity:
- `O(n * target)` where `target = totalSum / 2`

### Space Complexity:
- `O(target)` using a 1D DP array

---

## 🧑‍💻 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/partition-equal-subset-sum-java.git
cd partition-equal-subset-sum-java

