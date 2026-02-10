Day 19 / 100 | Linked List Cycle II

-Approach : O(n)
-First, detect if a cycle exists
Slow-Fast pointers,
-Move Slow by one step at a time, Fast by two steps at a time.
If slow == fast then cycle exists.
-Then reset one pointer to the head
-Move both pointers one step at a time
-The meeting point = start of the cycle