/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class MultithreadingDemo extends Thread
{
 public void run()
 {
 try
 {
 System.out.println ("Thread " +Thread.currentThread().getId() +" isrunning");

 }
 catch (Exception e)
 {

 System.out.println ("Exception is caught");
 }
 }
}

// Main Class
public class Main
{
 public static void main(String[] args)
 {
 int n = 8; // Number of threads
 for (int i=0; i<8; i++)
 {
 MultithreadingDemo object = new MultithreadingDemo();
 object.start();
 }
 }
} 