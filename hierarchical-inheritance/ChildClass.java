/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class ParentClass
{
	 void display1() {
		System.out.print("Hierarchical ");
	}
	void display2() {
		System.out.println("Inheritance ");
	}
}
class ChildcClass extends ParentClass
{
	 void display() {
	     display1();
	}
}
public class ChildClass extends ParentClass{
    void view(){
        display2();
    }
    public static void main(String[] args){
        ChildcClass cc = new ChildcClass();
        ChildClass c = new ChildClass();
        cc.display();
        c.view();
    }
}