/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Factorial
{
    int num;
    int fact;
    
    void setnum(int x)
    {
        num = x;
    }
    
    void calculate()
    {
        fact = 1;
        for(int i = num;i>0;i--)
        {
            fact = fact*i;
        }
    }
    
    void getfact()
    {
        calculate();
        System.out.println("Factorial:"+fact);
    }
}

public class Main{
    
	public static void main(String[] args) {
	    Factorial f2 = new Factorial();
	    f2.setnum(3);
	    //f2.calculate();
	    f2.getfact();
	}
}
