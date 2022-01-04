## In Optimized solution, we are using 2 stacks. We are optimizing front() & dequeue() operations. In normal soln, both front() & dequeue() were taking O(N) time always. But in optimized soln, both front() & dequeue() almost everytime takes O(1) time. In few instances, it takes O(N). Hence we takes it takes O(1) amortized time.

**Dequeue:**

> Steps:
1. We know that we are doing all push() into stack1. So stack2 will be empty initially
2. If its dequeue() op and if stack2 is empty, then we pop all items from stack1 & push to stack2. In this way, now the 1st inserted element is at the top of the stack & we can dequeue() it easily maintaining queue's FIFO & stack's LIFO. **In this case ONLY dequeue() will take O(N) time** 
3. But if stack2 is NOT empty, then we can just dequeue() it directly since it wil be the next most recently inserted element in queue/its the current top of the stack.**In this case dequeue() will take O(1) time** 

**Front():**

> Steps:
It is same as that dequeue(). Just the difference is that here we will just retirn the top element of stack2 instead of poping it. **So here also the time will be same as that Dequeue()**

## Eg:
> Push(4)
> Push(3)
> Push(2)
> Push(5)
> top()
> pop()
> pop()
> pop()
> Push(8)
> pop()
> top()

1. Initially s1 = [] & s2 = []
2. Now we will push elements 4,3,2,5 in s1.
    s1 = [4,3,2,5] s2= []

3. Now top(): Since s2 is empty, we transfer all items from s1 to s2.
    s1 = [] s2 = [5,2,3,4]
    And now just return top of s2 which is **4**. *Here it takes O(N)*

4. pop() : As we have elemnets in s2, we will directly pop from s2. So poped out element will be **4**. *Here it takes O(1) time to pop*
    s1 = [] s2 =[5,2,3]

5. pop(): Since s2 is not empty pop directly from s2. *O(1) time*
    s1 = [] s2 =[5,2]

6. pop(): s1 = [] s2 =[5]

7. push(8): We will push 8 into s1. s1 = [8] s2 =[5]

8. pop(): s1 = [8] s2 =[]

9. top(): Now since s2 is empty again; we transfer all items from s1 to s2 & retirn the top item which is **8**. *Here again it takes O(N)*. Even if it would have been pop() op, we would hve follwed same steps & time would have been O(N).
    s1 =[] s2 = [8]