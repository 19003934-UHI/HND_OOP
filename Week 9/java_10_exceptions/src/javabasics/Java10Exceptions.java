package javabasics;

/**
 * A test class to demonstrate the use of exceptions in Java.
 * 
 * It is suggested breakpoints are used to follow the order of execution after an
 * exception is thrown.
 * 
 * Read the document java_10_exceptions.docx with this sample code.
 */
public class Java10Exceptions {
	/**
	 * An array of strings to help demonstrate an Exception being created.
	 */
	static protected String[] smSomeStrings = {"String 1", "String 2", "String 3"};
	/**
	 * This function shows how we can handle an exception using a try/catch construct.
	 * 
	 * The finally block allows us to clean up any half completed tasks in the 
	 */
	static public void functionThatCatchesAnException(){
		try{
			System.out.println(smSomeStrings[3]);	// Note that this is an error, index 3 does not exist in the array
			
			// because the Exception has been thrown by the previous line of code the rest
			/// of the block is not executed, we skip to the catch block.
			System.out.println(smSomeStrings[2]);
			System.out.println(smSomeStrings[1]);
			System.out.println(smSomeStrings[0]);
			
		}catch(Exception e){
			System.out.println("The array has been accessed incorrectly so has thrown an exception.");
			
			// we can output some useful information by accessing the exception object
			e.printStackTrace(); // in this case we print out the stack trace of the exception
			
		}finally{
			// The finally block will be executed even if no exception is thrown
			// comment out line 20 and no exception is thrown
			System.out.println("The finally block is always executed.");
		}
		
	} // END FUNCTION functionThatCatchesAnException
	/**
	 * This function shows how we can pass any exceptions thrown up to the code that
	 * called the function and handle it there.
	 * 
	 * @throws Exception Exception thrown if array is accessed incorrectly.
	 */
	static public void functionThatThrowsAnException() throws Exception{
		System.out.println(smSomeStrings[3]);	// Note that this is an error, index 3 does not exist in the array
		
		// because the Exception has been thrown by the previous line of code the rest
		/// of the block is not executed, the exception is passed up to the code that called the function
		System.out.println(smSomeStrings[2]);
		System.out.println(smSomeStrings[1]);
		System.out.println(smSomeStrings[0]);
		
	} // END FUNCTION functionThatThrowsAnException
	/**
	 * Every Java application must contain at least one main function. The Java
	 * Virtual Machine searches for this function and calls it first to launch
	 * the application.
	 * 
	 * @param args An array of Strings given on the command-line.
	 */
	static public void main(String[] args) {
		System.out.println("Testing Exception handling:");
		
		/////////////////////////////////////////////////
		// CALL A FUNCTION THAT WILL HANDLE AN EXCEPTION
		
		Java10Exceptions.functionThatCatchesAnException();
		
		// Because the exception is handled in the function the program does
		// not break, it continues to run.
		
		/////////////////////////////////////////////////
		
		/////////////////////////////////////////////////
		// CALL A FUNCTION THAT WILL THROW AN EXCEPTION

		try{
			// because our function can potentially throw an exception it must be called in
			// a try/catch block
			Java10Exceptions.functionThatThrowsAnException();
			
		}catch(Exception e){
			System.out.println("The exception has been caught in main where the function was called from.");
			
			// we can output some useful information by accessing the exception object
			e.printStackTrace(); // in this case we print out the stack trace of the exception
			
		} // NOTE THAT WE DO NOT NEED THE FINALLY BLOCK
		
		/////////////////////////////////////////////////
		
	} // END FUNCTION main

} // END CLASS Java10Exceptions

