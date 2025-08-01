# 🔍 Word Search in 2D Matrix (Easy)

This project implements a simple and efficient solution to the **"Word Search in 2D Matrix"** problem, originally asked by **Microsoft** in technical interviews.

---

## 📘 Problem Description

You are given a 2D character matrix and a target word. Your task is to check whether the word exists in the matrix:

- **Horizontally** (left-to-right across any row)
- **Vertically** (top-to-bottom down any column)

### 🔹 Input
- A 2D character matrix of size `M x N`
- A string `word`

### 🔹 Output
- Return `true` if the word exists in the matrix (in row-wise or column-wise order)
- Return `false` otherwise

---

## 🧪 Example

### Input:
```java
matrix = [
    {'F', 'A', 'C', 'I'},
    {'O', 'B', 'Q', 'P'},
    {'A', 'N', 'O', 'B'},
    {'M', 'A', 'S', 'S'}
];

word = "FOAM";
