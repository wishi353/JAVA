/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main{
public static void main(String[] args){
StringBuffer str1 = new StringBuffer("Vaishnavi");
System.out.println("Inserting : " + str1.insert(0,"Hello "));
System.out.println("Deleting : " + str1.delete(0,5));
System.out.println("Replacing : " + str1.replace(6,10,"u"));
System.out.println("Deleting character at index 5: " + str1.deleteCharAt(6));
System.out.println("Str1 Length : " + str1.length());
str1.setLength(8);
System.out.println("After set length str1 : " + str1.toString());
}
}
