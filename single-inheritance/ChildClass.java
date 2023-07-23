/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class ParentClass
{
	 void display() {
		System.out.println("Single Inheritance");
	}
}
public class ChildClass extends ParentClass{
    void view(){
        display();
    }
    public static void main(String[] args){
        ChildClass c = new ChildClass();
        c.view();
    }
}
