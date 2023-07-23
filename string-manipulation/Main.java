/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main{
public static void main(String[] args){
String str1 = "Vaishnavi";
String str2 = "Wishi";
String str3 = "vAiShNaVi";
String str4 = "Hello Vaishnavi  ";
System.out.println("Length of str1 : " + str1.length());
System.out.println("Character at index 5 of str1 : " + str1.charAt(5));
System.out.println("Comapring str1 with str2 : " + str1.equals(str2));
System.out.println("Substring of str1 : " + str1.substring(4));
System.out.println("Substring of str1 : " + str1.substring(4,5));
System.out.println("Concatinating str1 and str2 : " + str1.concat(str2));
System.out.println("Index of i in str1 : " + str1.indexOf('i'));
System.out.println("Comparing str1 and str3 using ignore case : " + str1.equalsIgnoreCase(str3));
System.out.println("Comapring str1 with str2 : " + str1.compareTo(str2));
System.out.println("str1 to lower case : " + str1.toLowerCase());
System.out.println("str1 to upper case : " + str1.toUpperCase());
System.out.println("Triming of str4 : " + str4.trim());
System.out.println("Replacing W with V in str2 : " + str2.replace('W','V'));
}
}


