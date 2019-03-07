import java.io.*;
import java.util.*;

/** This class takes in the input from the user and pushes it to the
 *  stack and then when escape is called will get the previous moves
 *  entered in the stack and reverses them to take you out of the maze
 *  @author     Allen Rankin
 *  @id         aarankin
 *  @course     CSIS 252:  Programming II
 *  @assignment Lab 2 - Maze
 *  @related    IOSystem.java, Lab2.java, LLNode.java,  
 *              Stack.java, StackInterface.java, StackOverflowException.java,
 *              StackUnderflowException.java, UnboundedStackInterface.java
 */

public class MazeRunner{
    Stack<String> myStack;
    private IOSystem io;
    
    /**When called, this method sends the input from
      *the user to the stack
      */
    public MazeRunner(IOSystem io){
        this.io=io;
        String instruct;
        boolean escape;
        
        myStack = new Stack<String>();
        escape=false;
        instruct="";
        
        io.print("Enter instructions:");
        while(escape!=true){
            try{
                instruct = io.nextLine();
            }
            catch(IOException e){
                io.println("End of the console");
           }   
           if(instruct.equals("e"))
                escape=true;
           else
           	    myStack.push(instruct);
         }
         escape();
    }
    /**
      *When called, this method will print two left instructions to
      *turn the robot around, and then 
      */
    public void escape(){
        String revMove;
        
        io.println("");
        io.println("Escaping...");
        io.println("l");
        io.println("l");
        
        //continues to run until stack is empty
        while(!myStack.isEmpty()){
            revMove=myStack.top();
            myStack.pop();
            io.println(switchInstruct(revMove));      
        }
    }   
      
    /**
      * @params instruct - is the instruction from the user
      * @returns the reverse instruction from the escape method
      */  
    public String switchInstruct(String instruct){
        if(instruct.equals("f"))
            return "f";
        else if(instruct.equals("l"))
            return ("r");
        else if(instruct.equals("r"))
            return ("l");
        return ("0");    
    }
}