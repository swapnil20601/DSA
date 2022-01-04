You have to implement Queue using 2 stacks such that functionality of Queue(FIFO) is maintained. 
You can use inbuilt stack data structure.
```
Enqueue() - Add element to the queue. It should be in O(1)
Dequeue() - Removes & return element from queue. If queue is empty return -1. It should be in O(N)
front() - Returns front element of the queue.  If queue is empty return -1. It should be O(N)
getSize() --Returns size of the queue
isEmpty() -- returns true or false
```

eg:

1. enq(10)
2. enq(20)
3. enq(30)

So now in this case, stack1 = [10,20,30]

If you call dequeue(), then you should get 10 & not 30 bcoz queue maintains FIFO manner. The 1st item to go into queue was 10 & 30 was last.

So we use 2nd stack. We will pop all elements from stack1 into stack2. So we will have stack2 = [30,20,10]. 
And now we can call dequeue() or front() so that we will get 10 as front/dequeue