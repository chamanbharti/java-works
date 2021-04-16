package com.stack;
/*A Stack is an abstract data type or collection where in Push,the addition of data elements to the collection, 
 * and Pop, the removal of data elements from the collection, are the major operations performed on the collection. 
 * The Push and Pop operations are performed only at one end of the Stack which is referred to as the 'top of the stack'.

In other words,a Stack can be simply defined as Last In First Out (LIFO) data structure,i.e.,the last element added at 
the top of the stack(In) should be the first element to be removed(Out) from the stack.

Stack Operations:

Push: A new entity can be added to the top of the collection.
Pop: An entity will be removed from the top of the collection.
Peek or Top: Returns the top of the entity with out removing it.
Overflow State: A stack may be implemented to have a bounded capacity. If the stack is full and does not contain enough 
space to accept an entity to be pushed, the stack is then considered to be in an overflow state.

Underflow State: The pop operation removes an item from the top of the stack. A pop either reveals previously concealed 
items or results in an empty stack, but, if the stack is empty, it goes into underflow state, which means no items are 
present in stack to be removed.

A stack is a restricted data structure, because only a small number of operations are performed on it. The nature of 
the pop and push operations also means that stack elements have a natural order. Elements are removed from the stack in 
the reverse order to the order of their addition. Therefore, the lower elements are those that have been on the stack 
the longest.

Efficiency of Stacks

In the stack, the elements can be push or pop one at a time in constant O(1) time. 
That is, the time is not dependent on how many items are in the stack and is therefore very quick. No comparisons or 
moves are necessary.
 * 
 * */
public class Stack1 {
	private int stackSize;
    private int[] stackArr;
    private int top;
 
    /**
     * constructor to create stack with size
     * @param size
     */
    public Stack1(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }
    
    /**
     * This method adds new entry to the top 
     * of the stack
     * @param entry
     * @throws Exception 
     */
    public void push(int entry) throws Exception {
        if(this.isStackFull()){
            throw new Exception("Stack is already full. Can not add element.");
        }
        System.out.println("Adding: "+entry);
        this.stackArr[++top] = entry;
    }
    
    /**
     * This method removes an entry from the 
     * top of the stack.
     * @return
     * @throws Exception 
     */
    public int pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        int entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
    
    /**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
    public int peek() {
        return stackArr[top];
    }
 
    /**
     * This method returns true if the stack is 
     * empty
     * @return
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    /**
     * This method returns true if the stack is full
     * @return
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
    
    public static void main(String[] args) {
    	Stack1 stack = new Stack1(5);
        try {
            stack.push(4);
            stack.push(8);
            stack.push(3);
            stack.push(89);
            stack.pop();
            stack.push(34);
            stack.push(45);
            stack.push(78);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}
