/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Factorial{
   int factorial(int x){
       if(x==1){
           return 1;
       }
       else{
          int fact = factorial(x-1)*x;
           return fact;
       }
   }
}
public class Main
{
	public static void main(String[] args) {
	    Factorial f = new Factorial();
	    int ans = f.factorial(5);
		System.out.println("Factorial:"+ans);
	}
}
