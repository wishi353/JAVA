/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class ClassA
{
 public void dispA()
 {
 System.out.println("Hybrid");
 }
}

interface InterfaceB
{
 public void show();
}

interface InterfaceC
{
 public void show();
}

public class ClassD extends ClassA implements InterfaceB,InterfaceC
{
 public void show()
 {
 System.out.println("Inheritance");
 }
 public void dispD()
 {
 dispA();
 }
 public static void main(String args[])
 {
 ClassD d = new ClassD();
 d.dispD();
 d.show();
 }
}
