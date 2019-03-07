/** This class holds data in a stack for the program, it can return
 *  its top value, push a new value, remove its top value or return 
 *  if it is empty or not
 *  @author     Cathy Bareiss
 *  @id         cbareiss
 *  @course     CSIS 252:  Programming II
 *  @assignment Lab 2 - Maze
 *  @related    IOSystem.java, Lab2.java, LLNode.java, MazeRunner.java,   
 *              StackInterface.java, StackOverflowException.java,
 *              StackUnderflowException.java, UnboundedStackInterface.java
 */

public class Stack<T> implements UnboundStackInterface<T> {
    /**initializes the LLNode class*/
    protected LLNode<T> top;
    
    /**sets the top of the stack to Null when initialized*/
    public Stack () {
        top = null;
    }
    /**checks the stack to see if it is empty
      *@returns true if top is null
      */
    public boolean isEmpty() {
        return top == null;
    }
    
    /**Pushes the given element to the stack
      *@params element - is inserted into the stack
    */
    public void push (T element) {
        LLNode<T> newNode;
        
        newNode = new LLNode<T>(element);
        newNode.setLink(top);
        top = newNode;
    }
    
    /**Gets what's on top of the stack
      *@returns whats on top of the stack
      */
    public T top() throws StackUnderflowException {
        if (!isEmpty())
            return top.getInfo();
        else
            throw new StackUnderflowException("Top attempted on empty stack");
    }
    
    /**Removes the top value from the stack*/
    public void pop() throws StackUnderflowException {
        if (!isEmpty())
            top = top.getLink();
        else
            throw new StackUnderflowException("Pop attempted on empty stack");
    }
    
    /**Can be used for testing purposes to print out stack*/
    public String toString() {
        return " ";
    }
}
