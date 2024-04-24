/* 
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 

Constraints:

-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin.
*/ 

import java.util.Stack;

class MinStack {
    Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[]{val, val});
        } else {
            int currMin = stack.peek()[1];
            stack.push(new int[]{val, Math.min(val, currMin)});
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }
    
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek()[0];//return stack.peek()[0];, stack.peek() returns the top element of the stack, which is an array representing a pair of values: the actual value and the minimum value encountered so far.
        }
        return -1; // or throw an exception
    }
    
    public int getMin() {
        if (!stack.isEmpty()) {
            return stack.peek()[1];
        }
        return -1; // or throw an exception
    }
}

//we store each element in the stack as an array of size 2. The first element of the array stores the actual value, and the second element stores the minimum value encountered so far.

//When we call stack.peek(), it returns the top element of the stack, which is an array containing the actual value and the minimum value encountered so far. To retrieve the minimum value, we access the second element of this array, which is at index 1.

//So, return stack.peek()[1]; means that we are accessing the minimum value encountered so far, which is stored at index 1 of the array returned by stack.peek().

//stack.peek()[0] represents the actual value of the top element of the stack, and stack.peek()[1] represents the minimum value encountered so far.






 

