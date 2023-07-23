/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Constructor{
    String a;
    Constructor(){
        System.out.println("Default Constructor");
    }
    Constructor(String a){
        this.a=a;
        System.out.println(a);
    }
    Constructor(Constructor c){
        System.out.println("Copying parameterized constructor");
        System.out.println(c.a);
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor("This is parameterized Constructor");
		Constructor c3 = new Constructor(c2);
	}
}
