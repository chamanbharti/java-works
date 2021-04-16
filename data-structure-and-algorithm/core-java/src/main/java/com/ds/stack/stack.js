function Stack(array){
    this.array = [];
    if(array){
        this.array = array;
    }
}
    Stack.prototype.getBuffer = function(){
        return this.array.slice();
    }

    Stack.prototype.isEmpty = function(){
        return this.array.length == 0;
    }

    //instance of the stack class
    var stack1 = new Stack();

    console.log(stack1);//Stack { array: [] }

    //Insertion 
    Stack.prototype.push = function(value){
        this.array.push(value);
    }
    stack1.push(1);
    stack1.push(2);
    stack1.push(3);
    console.log(stack1); // {array: [1,2,3]} Time Complexity: O(1)

  /* Peek:
    Peeking at the last added element of the stack means returning the last-added element
    without removing it from the data structure.
*/
    Stack.prototype.peek = function(){
        return this.array[this.array.length-1];
    }
    stack1.push(10);
    console.log(stack1.peek());//10 Time Complexity: O(1)
    stack1.push(5);
    stack1.push(6);
    console.log(stack1.peek());//6 Time Complexity: O(1)

    //Deletion
    Stack.prototype.pop = function(){
        return this.array.pop();
    }
    console.log(stack1);//Stack { array: [ 1, 2, 3, 10, 5, 6 ] }
    console.log(stack1.pop());//6 Time Complexity: O(1)
    
   // Access: Accessing specific elements in a data structure is important.
   function stackAccessNthTopNode(stack, n) {
       var bufferArray = stack.getBuffer();
       if(n<=0) throw 'error'

       var bufferStack = new Stack(bufferArray);
       while(--n !==0){
           bufferStack.pop();
       }
       return bufferStack.pop();
   }
   var stack2 = new Stack();
   stack2.push(1);
   stack2.push(2);
   stack2.push(3);
   console.log(stackAccessNthTopNode(stack2, 2));//2 Time Complexity: O(n)

   /*
    Search:
Searching the stack data structure for a specific element is a critical operation. To do this,
you must first create a buffer stack so that pop can be called on that buffer stack. This
way, the original stack is not mutated, and nothing is removed from it.
   */
  function stackSearch(stack, element) {
      var bufferArray = stack.getBuffer();
      var bufferStack = new Stack(bufferArray); // copy into buffer
      while(!bufferStack.isEmpty()){
          if(bufferStack.pop() == element){
              return true;
          }
      }
      return false;
  }

  console.log(stackSearch(stack1, 3)); // true, Time Complexity: O(n)