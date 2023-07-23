/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Try{
    abstract void display();
}

class Example extends Try{
    void display(){
        System.out.println("Abstract Classes");
    }
}
public class Main{
	public static void main(String[] args) {
		Try t = new Example();
		t.display();
	}
}
