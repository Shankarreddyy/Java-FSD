package FileHandling;
import java.io.BufferedWriter;
import java.io.File; 
// Importing  the File class
import java.io.IOException;
import java.io.FileWriter; 
import java.util.Scanner;
import java.io.FileNotFoundException;
public class CreatingFile {
public static void main(String[] args) {
 // Creating an object of a file
	
	try {
		FileWriter Writer = new FileWriter("C:File.txt");
		 // Writes this content into the file
		Writer.write("NeverGiveUp;  "); 
		 
		Writer.close(); 
		System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
		}
	//reading the data from file
	try {
        File Obj1 = new File("C:File.txt");
        Scanner Reader = new Scanner(Obj1);
        while (Reader.hasNextLine()) {
            String data = Reader.nextLine();
            System.out.println(data);
            System.out.println("File Data Sucessfully printed");
        }
        Reader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error has occurred.");
        e.printStackTrace();
    }
	// appending to file
	String textAppend = "All the Best";
	String filePath1 = "C:File.txt";

	try(FileWriter f = new FileWriter(filePath1, true);
	BufferedWriter writer = new BufferedWriter(f);) {

	  writer.write(textAppend);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	// After appending to file; total content in the file 
	try {
        File Obj2 = new File("C:File.txt");
        Scanner Reader = new Scanner(Obj2);
        while (Reader.hasNextLine()) {
            String data = Reader.nextLine();
            System.out.println(data);
        }
        Reader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error has occurred.");
        e.printStackTrace();
    }
		}
}