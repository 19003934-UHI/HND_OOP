package javalibraries;

// To access the File class we need to import the class from its package
// we use the import keyword with the full package path and class name:
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * A test class to demonstrate the use of the Java library java.io.File and
 * supporting libraries to read and write.
 *
 * Read the document java_libraries_3_files.docx with this sample code.
 *
 * This sample code is intended to demonstrate the basic use of the class File and
 * supporting classes required to read and write to files.
 * It is not exhaustive, see the Java documentation for a full list of functions.
 */
public class JavaLib3Files {
	/**
	 * Every Java application must contain at least one main function. The Java
	 * Virtual Machine searches for this function and calls it first to launch
	 * the application.
	 *
	 * @param args An array of Strings given on the command-line.
	 */
	static public void main(String[] args) {
		//////////////////////////////////
		// OPEN AN EXISTING FILE
		
		System.out.println("OPEN AN EXISTING FILE");
		
		// A file is opened in JAva by creating an instance of the File class
		// We do this using its constructor and the new operator.
		
		File textFile = new File("res/inputfile.txt");	// we pass the filename as a parameter to the constructor
		
		// now we have an Object instance of File we can test it, the function exists()
		// tests if the file exists on the file system
		if(textFile.exists()){
			System.out.println("Found file textFile : " + textFile.getName());
		}else{
			System.out.println("Cannot find file : " + textFile.getAbsolutePath() + "/" + textFile.getName());
		}
		
		//////////////////////////////////

		//////////////////////////////////
		// READING FROM A FILE
		
		System.out.println("READING FROM A FILE");

		// Java must fetch the data from the storage medium (like a disk) so
		// some classes are provided to do this. FileReader allows us to read
		// the raw characters from the file
		FileReader reader = null;
		
		// Reading characters is time consuming so Java provides another class that
		// does this for us and offers a more useful interface
		BufferedReader inputBuffer = null;
		
		try {
			// a FileReader is created by passing a File object as a parameter to the constructor
			// this throws an exception if the file does not exist so we have to catch it.
			reader = new FileReader(textFile);
			
			// a BufferedReader is created by passing a Reader as a parameter to the constructor
			inputBuffer = new BufferedReader(reader);
			
			// Now we are ready to read something from the file, note that readLine also throws an
			// exception so we have to add a catch block for IOException
			String inputLine = inputBuffer.readLine();
			
			System.out.println(inputLine);	// we can now see the first line of our file on the console
			
			// if we wanted to read all the lines in the file we could loop until readLine() can't read any more
			
			while(inputLine != null){	// out condition is to loop until readLine() can't find any more lines
				
				inputLine = inputBuffer.readLine();	// try to read a line
				
				System.out.println(inputLine);	// output the result
				
			} // END WHILE
			
		} catch (FileNotFoundException fnfe) {	// even though we know the file exists Java still needs to catch the potential error
			fnfe.printStackTrace();
			
		} catch (IOException ioe){	// readLine() throws an IOException for any problem reading a line from the file
			ioe.printStackTrace();
			
		} finally {
			// an input buffer is a resource we have to dispose of so we put it in
			// the finally block to make sure it always happens
			if(inputBuffer != null){
				try {
					inputBuffer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		//////////////////////////////////

		//////////////////////////////////
		// CREATING A FILE
		
		System.out.println("CREATING A FILE");
		
		// We can also use the File class to create new files
		
		// This time we use the filename for the file we want to create as a parameter
		File outputFile = new File("res/outputFile.txt");
		
		try {
			// we want to create the file so we call createNewFile()
			if(outputFile.createNewFile()){
				// if createNewFile() returns true it means the file was created
				System.out.println("New file created : " + textFile.getAbsolutePath() + "/" + textFile.getName());
				
			}else{
				// if createNewFile() returns false it means the file already exists
				System.out.println("File already exists : " + textFile.getAbsolutePath() + "/" + textFile.getName());
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		//////////////////////////////////

		//////////////////////////////////
		// WRITING TO A FILE
		
		System.out.println("WRITING TO A FILE");
		
		// In similar fashion to reading a file, Java provides some classed to support writing.
		
		// The FileWriter provides basic writing functionality.
		FileWriter writer = null;
		
		// The BufferedWriter provides some more sophisticated functionality, buffering the output to make the writing efficient.
		BufferedWriter outputBuffer = null;
		try {
			
			// We create a FileWriter by passing our File object to the constructor.
			writer = new FileWriter(outputFile);
			
			// Now we can create a BufferedWriter by passing the writer Object to the BufferedWriter constructor.
			outputBuffer = new BufferedWriter(writer);
			
			// Once we have an Object to write with we can write out some Strings to the file using
			// the write() function.
			outputBuffer.write("Output file from Java.\n");
			outputBuffer.write("We have learned a little about the beautiful mind of Ada Lovelace.\n");
			outputBuffer.write("And we have been introduced to reading and writing files in Java.\n");
			
		}catch(IOException ioe){ // both creating FileWriter and write() can throw an Exception so we hava a catch to handle them
			ioe.printStackTrace();
			
		}finally{	// we have an open file so we must make sure it is disposed of in a finally block
			if(outputBuffer != null){
				try {
					outputBuffer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		//////////////////////////////////
		
		

	} // END FUNCTION main

} // END CLASS JavaLib3Files

