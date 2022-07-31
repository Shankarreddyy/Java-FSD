package FileHandling;

import java.io.BufferedWriter;
import java.io.File; // Import the File class
import java.io.IOException;
import java.io.FileWriter; 
import java.util.Scanner;
import java.io.FileNotFoundException;
// Import the File class
import java.io.File;

//Import the IOException class to handle errors
import java.io.IOException; 

public class newfile {
public static void main(String[] args) {
	String content;
try {
//Creating an object of a file
File myObj = new File("C:file11.txt"); 
if (myObj.createNewFile()) {
System.out.println("File created: " + myObj.getName());
} else {
System.out.println("File already exists.");
}
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
try {
    File Obj = new File("C:file11.txt");
    Scanner Reader = new Scanner(Obj);
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
