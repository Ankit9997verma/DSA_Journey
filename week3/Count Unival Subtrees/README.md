# 🌳 Count Unival Subtrees

This project solves the **"Count Unival Subtrees"** problem — a common coding interview question (asked by **Google**) related to binary trees.

---

## 📘 Problem Description

A **unival tree** (short for *universal value tree*) is a subtree where **all nodes have the same value**.

You are given the **root of a binary tree**, and your task is to **count the number of unival subtrees** present in the tree.

> 🔹 A single node is considered a unival subtree by default.

---

## 🧪 Example

### 🔸 Input Tree:

    0
   / \
  1   0
     / \
    1   0
   / \
  1   1


### ✅ Explanation:
The 5 unival subtrees are:
1. Leaf node `1` (leftmost)
2. Leaf node `0` (rightmost)
3. Two `1` leaf nodes under left of right subtree
4. Subtree rooted at that `1` node (both children are `1`)

---

## 🚀 Approach

- Perform a **post-order traversal** of the binary tree.
- Check at each node whether the subtree rooted at that node is **unival**.
- Count it if it is.

---

## 🧠 Complexity

- **Time Complexity:** `O(n)` — Each node is visited once.
- **Space Complexity:** `O(h)` — Recursive call stack (where h is the tree height).

---



