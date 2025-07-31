Problem Statement
Given three strings S1, S2, and S3, find the length of the Longest Common Subsequence (LCS) present in all three. A subsequence retains relative order but characters may be non‑adjacent.

S1 = "AGGT12"
S2 = "12TXAYB"
S3 = "12XBA"
Longest common subsequence = "12" → length = 2

Bottom‑Up 3D Dynamic Programming:-
Create a 3D table dp[i][j][k] where:
dp[i][j][k] = LCS length of:
  first i chars of S1,
  first j chars of S2,
  first k chars of S3.

 Initialization (Base Case):-
  if i==0 or j==0 or k==0 => dp[i][j][k] = 0

  recurrence:-
  if S1[i-1] == S2[j-1] == S3[k-1]:
    dp[i][j][k] = dp[i-1][j-1][k-1] + 1
else:
    dp[i][j][k] = max(dp[i-1][j][k],
    dp[i][j-1][k],
    dp[i][j][k-1])

    Answer:-
    dp[n1][n2][n3]

  Time Complexity: O(n1 × n2 × n3)
Space Complexity: O(n1 × n2 × n3)  
