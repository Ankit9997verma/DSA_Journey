Line 1: A string W (the input word)
Line 2: An integer N (number of words in the dictionary)
Next N lines: Each contains one valid dictionary word



---

## 📤 Output Format

Print each valid step word (one per line) in **lexicographical order**.

---

## 🧠 Example

### Input:

apple
5
appeal
apply
pepla
papple
apples


### Output:
appeal
papple



### ✅ Explanation:
- `appeal` = `apple` + `a` → anagram → valid  
- `papple` = `apple` + `p` → anagram → valid  
- `apply`, `pepla`, `apples` → not valid (either not one letter added, or not anagram)  

---

## 🚀 Approach

1. Count character frequencies of the input word using `int[26]`.
2. For each word in the dictionary:
   - If `length != word.length + 1`, skip.
   - Count character frequency of the word.
   - Check if there's **exactly one extra character**.
3. If valid, add to result list.
4. Sort the list and print results.

---

## 🕒 Time Complexity

- **O(N × K)**  
  Where:  
  - `N` = number of dictionary words  
  - `K` = max word length (≤ 15)

---