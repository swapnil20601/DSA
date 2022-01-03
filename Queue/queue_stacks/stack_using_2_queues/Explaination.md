You have to use 2 queues to implement stack.


# Push Operation:

Say you have 2 queues Q1 & Q2. Q2 will act as auxiliary queue

**Steps:**
1. You will push element to Q2
2. Remove all elements from Q1 and add them to Q2
3. Again remove all elements from Q2 and add them to Q1
4. Do this for all push operations

In this way we are trying to bring last inserted element to the front of Q1 so that stack's LIFO is also maintained &
front is pointing to 1st element of Q1. This way when you pop() you will remove 1st elment of Q1 & manintain queues' FIFO behavior. And since that element is at the top & is last inserted element in stack, pop() & top() becomes easy.

**Complexity is O(N)**

# Pop & top operation:
Just remove the front element of Q1 for pop & for top just return the front element of Q1

**Complexity for both is O(1)**

Lets saythe queries are: 
push(3)
push(4)
push(5)
push(8)
top()
pop()
top()
pop()


Stack will look = [3,4,5,8] until pop

*For push(3):*

Q1 =[]
Q2 = [3]

Since there is nothing to remove from Q1, we move to step 3 & remove all elements from Q2 and add them to Q1.
After push();

Q1 = [3]
Q2 = []


*For push(4):*

Q1 =[3]
Q2 = [4]

Remove all elements from Q1 and add them to Q2

Q1 = []
Q2 = [4,3]

Remove all elements from Q2 and add them to Q1.
After push();

Q1 = [4,3]
Q2= []


*For push(5):*

Q1 =[4,3]
Q2 = [5]

Remove all elements from Q1 and add them to Q2

Q1 = []
Q2 = [5,4,3]

Remove all elements from Q2 and add them to Q1.
After push();

Q1 = [5,4,3]
Q2= []

*For push(8):*

Q1 =[5,4,3]
Q2 = [8]

Remove all elements from Q1 and add them to Q2

Q1 = []
Q2 = [8,5,4,3]

Remove all elements from Q2 and add them to Q1.
After push();

Q1 = [8,5,4,3]
Q2= []

So you see how Q1 = [8,5,4,3] has become similar to stack = [3,4,5,8]. Now top is poitning to 8 both in stack & Q1