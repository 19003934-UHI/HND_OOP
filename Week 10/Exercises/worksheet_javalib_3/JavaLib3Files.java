import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class JavaLib3Files {

    public static void main(String[] args) {
        Files.readFile("../InputFile/res/inputfile.txt");
        Files.writeFile("outputfile.txt");

    }

    public static void readFile(String filename) {

        File inputFile = new File(filename);

        FileReader reader = null;
        BufferedReader inputBuffer = null;

        try {
            reader = new FileReader(filename);

            inputBuffer = new BufferedReader(reader);

            String inputLine = inputBuffer.readLine();

            System.out.println(inputLine);

            while (inputLine != null) {
                inputLine = inputBuffer.readLine();

                System.out.println(inputLine);
            } // while end
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();

        } catch (IOException ioe) {
            ioe.printStackTrace();

        } finally {
            // an input buffer is a resource we have to dispose of so we put it in
            // the finally block to make sure it always happens
            if (inputBuffer != null) {
                try {
                    inputBuffer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } // try catch end
    } // readFile end

    public static void writeFile(String filename, String[] content) throws IOException {
        File outputFile = new File(filename);

        FileWriter writer = null;
        BufferedWriter outputBuffer = null;

        try {
            writer = new FileWriter(outputFile);
            outputBuffer = new BufferedWriter(writer);

            while (outputFile != null) {
                for (int i = 0; i < content.length; i++) {
                    outputBuffer.write("Output file:");
                    content[i] = content[i];
                }

            } // while end
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            outputFile.createNewFile();
        } finally {
        }
    }
} // class end
