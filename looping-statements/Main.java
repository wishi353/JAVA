/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    System.out.println("For loop");
	    for(int i=0;i<5;i++){
		System.out.println(i+1);
	}
	System.out.println("While Loop");
	int j=1;
	while(j<=5){
	    System.out.println(j);
	    j++;
	}
	System.out.println("Do While Loop");
	int k=1;
	do{
	    System.out.println(k);
	    k++;
	}
	while(k<=5);
}
}
