/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class NestedMethod{
    void display(){
        System.out.println("Display");
    }
       void display1(){
            System.out.println("Display1");
            display();
        }
            void display2(){
                System.out.println("Display2");
                display1();
            }
}
public class Main
{
	public static void main(String[] args) {
		NestedMethod nm = new NestedMethod();
		nm.display2();
	}
}
