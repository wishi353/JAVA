/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int z, a, b, choice;
	    Scanner scn = new Scanner(System.in);
	     choice = scn.nextInt();
	     a = scn.nextInt();
	     b = scn.nextInt();
	    switch(choice)
	    {
	        case 1:
	            z = a + b;
	            System.out.println("Addition : "+z);
	            break;
	       case 2:
	            z = a + b;
	            System.out.println("Subtraction : "+z);
	            break;
	       case 3:
	            z = a + b;
	            System.out.println("Multiplication : "+z);
	            break;
	       case 4:
	            z = a + b;
	            System.out.println("Division : "+z);
	            break;
	       default:
	            System.out.println("Wrong choice");
	            break;
	    }
	}
}
