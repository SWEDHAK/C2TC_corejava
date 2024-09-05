package day1;

public class hello {
		  public static void main(String[] args) {
		    
// arithmetic operator
		    int a = 20, b = 8;

		    // addition operator
		    System.out.println("a + b = " + (a + b));

		    // subtraction operator
		    System.out.println("a - b = " + (a - b));

		    // multiplication operator
		    System.out.println("a * b = " + (a * b));

		    // division operator
		    System.out.println("a / b = " + (a / b));

		    // modulo operator
		    System.out.println("a % b = " + (a % b));
		 
 
// assignment operator
	    int p = 4;
	    int var;

	    // assign value using =
	    var = p;
	    System.out.println("var using =: " + var);

	    // assign value using =+
	    var += p;
	    System.out.println("var using +=: " + var);

	    // assign value using =*
	    var *= p;
	    System.out.println("var using *=: " + var);
		 
		  
	    
// relational operatorS
	    
	    int s = 10, r = 21;
	    // == operator
	    System.out.println(s == r);   

	    // != operator
	    System.out.println(s != r);
	    // > operator
	    System.out.println(s > r);   

	    // < operator
	    System.out.println(s < r);   

	    // >= operator
	    System.out.println(s >= r);   

	    // <= operator
	    System.out.println(s <= r);
	    
//logical operator
	    System.out.println((20 > 4) && (9 > 5));   
	    System.out.println((5 > 3) && (8 < 5));   

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));   
	    System.out.println((5 > 3) || (8 < 5));  
	    System.out.println((5 < 3) || (8 < 5));   

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));
		  }
}
	    