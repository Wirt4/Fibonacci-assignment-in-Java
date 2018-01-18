/*
 * We're gonna set up a fibonacci sequence, mmmkay?
 * The criteria for this project are laid out in
 * https://see.stanford.edu/materials/icspmcs106a/15-section-handout-2.pdf
 */
import acm.program.*;
public class Fibonacci extends ConsoleProgram {
/* sets the varialbes for the program, 
 * so an instructor would be able adjust the parameters if needed*/
/*   private static final int MaxTermValue = 10000;
   private int i = 0;
   public void run() {
      println("This program lists the Fibonacci sequence.");
      while(fib(i)<MaxTermValue) {
    	  println (fib(i));
    	  i++;
      }
	
}
*/
	public void run() {
	println (fib(3));
	}
/*Here we have a method returning a given number of the fibonacci sequence 
 */
   private int fib(int i) {
      if(i==0) {
    	  return 0;
      }else if(i==1) {
    	  return 1;
      }else {
    	  return fib(i-1) + fib(i-2);
      }
   }
}