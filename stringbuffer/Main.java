/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	 StringBuffer sb = new StringBuffer("Hello");
	 sb.replace(1,5,"iii");
     System.out.println(sb);
	 sb.append(" Vaishnavi");
	 System.out.println(sb);
	 sb.insert(1,"i");
	 System.out.println(sb);
	 sb.reverse();
     System.out.println(sb);
     
}
}