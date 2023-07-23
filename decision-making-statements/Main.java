/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int a=2;
	    if(a>1){
	       System.out.println("Condition true"); 
	    }
	    else{
	        System.out.println("Condition false");
	    }
		
		if(a>=0){
		    if(a>=1){
		        System.out.println("Condition true");
		    }
		    else{
		        System.out.println("Condition false");
		    }
		}
		else{
		    System.out.println("Condition false");
		}
		
		if(a<3){
		    System.out.println("Condition true");
		}
		else{
		    if(a==2){
		        System.out.println("Condition true");
		    }
		    else{
		        System.out.println("Condition false");
		    }
		}
		
		switch(a){
		    case 1:
		        System.out.println("Case 1");
		        break;
		    case 2:
		        System.out.println("Case 2");
		        break;
		    case 3:
		        System.out.println("Case 3");
		        break;
		    default:
		        System.out.println("Case 1");
		        break;
		}
	}
}
