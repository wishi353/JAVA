/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Recurssion{
   int recurssion(int x){
       if(x==0){
           return 0;
       }
       else{
          int sum = x + recurssion(x-1);
           return sum;
       }
   }
}
public class Main
{
	public static void main(String[] args) {
	    Recurssion r = new Recurssion();
	    int ans = r.recurssion(3);
		System.out.println("Sum:"+ans);
	}
}
