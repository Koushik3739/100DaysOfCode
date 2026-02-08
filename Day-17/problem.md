Day 17 / 100 | Minimum Deletions to Make String Balanced

-Approach : O(n)
-A balanced string has all 'a' before 'b'.
-Count total 'a' in the string
-Traverse left to right:
-If 'b' then, increases deletions on the left
-If 'a' then decreases remaining 'a' on right
-At every index, minimize
-Deletions = leftB + rightA