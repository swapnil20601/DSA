Ex : Q = [1,2,3,4,5] & k = 3

We have to reverse 1st k elements. So final ans should be Q = [3,2,1,4,5]

We know how to reverse a queue.

**Steps:**

1. Using recursion reverse first k elements. Same logic as that of reversing a queue. So after that Q will = [4,5,3,2,1]

2. Now just pop n-k elements from Q and add them back to Q 1-by-1. You will get final answer


## Another Approach is using Stack. But this will increase space complexity to O(N) -- space consumed by aux stack that we are using

**Steps:**

Ex : Q = [1,2,3,4,5] & k = 3

1. Pop first k elements from Q & push them into stack.

Stack = [1,2,3], Q = [4,5]

2. Pop all elements from stack & add them to Q.

stack = [], Q =[4,5,3,2,1]

3. Now just pop n-k elements from Q and add them back to Q 1-by-1. You will get final answer