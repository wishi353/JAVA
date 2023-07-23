/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Stack{
    int stk[] = new int[10];
    int top=-1;
    public void push(int item){
        if(top>=9)
        {
            System.out.println("Stack Overflow");
        }
        else{
            stk[++top] = item ;
        }
        
    }
    
    public int pop(){
        if(top<=-1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
        return stk[top--];
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    Stack stack = new Stack();
	    stack.push(10);
	    stack.push(9);
	    stack.push(84);
	    stack.push(73);
	    stack.push(60);
	    stack.push(99);
	    stack.push(89);
	    stack.push(45);
	    stack.push(32);
	    stack.push(12);
	    System.out.println("Stack POP"+stack.pop());
		 System.out.println("Stack POP"+stack.pop());
	}
}
