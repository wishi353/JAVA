/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static String a = "Static Variable";
    static{
        System.out.println("Static block");
    }
    static void display(){
        System.out.println("Static Method");
    }
	public static void main(String[] args) {
		System.out.println(a);
		display();
	}
}
