/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class ParentClass
{
	 void display1() {
		System.out.println("Multilevel Inheritance");
	}
}
class ChildParentClass extends ParentClass
{
	 void display() {
	     display1();
	}
}
public class ChildClass extends ChildParentClass{
    void view(){
        display();
    }
    public static void main(String[] args){
        ChildClass c = new ChildClass();
        c.view();
    }
}