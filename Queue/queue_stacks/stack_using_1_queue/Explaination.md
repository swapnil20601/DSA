This is optimized version of implementing stack using 2 queues.
Checkout stack_using_2_queues first to understand how to optimize the code to use just 1 queue.

# Push Operation:

**Steps:**
1. You will push element **X** to Q first
2. Then you will pop all the elements that are just before **X** from queue & add them after **X** one by one such that **X** becomes front element of the queue OR becomes 1st element of queue.

3. You will continue this for all push operations.

In this way we are trying to bring last inserted element to the front of Queue so that stack's LIFO is also maintained &
front is always pointing to 1st element of Queue. 

**Complexity is O(N)**

# Pop & top operation:
Just remove the front element of Queue for pop & for top just return the front element of Queue

**Complexity for both is O(1)**

Lets saythe queries are: 
push(3)
push(2)
push(4)
push(1)
top()
pop()
top()
pop()


Stack will look = [3,2,4,1] until pop

*For push(3):*

Q =[3]

Since there are no elements before 3 to pop, so 3 is top element as of now.
After push();

Q = [3]


*For push(2):*

Q =[3,2]

Remove all elements before 2 & add them back to Q after 2. In this case, 3 will be poped & added after 2

Q = [2,3]

After push();

Q = [2,3]

*For push(4):*

Q =[2,3,4]

Remove all elements before 4 & add them back to Q after 4. In this case, 2 & 3 will be poped & added after 4

Q = [4,2,3]

After push();

Q = [4,2,3]


*For push(1):*

Q =[4,2,3,1]

Remove all elements before 1 & add them back to Q after 1. In this case, 2 ,3 & 4 will be poped & added after 1

Q = [1,4,2,3]

After push();

Q = [1,4,2,3]

So you see how Q = [1,4,2,3] has become similar to stack = [3,2,4,1]. Now top/front is poitning to 1 both in stack & Q1 maintaining both FIFO & LIFO