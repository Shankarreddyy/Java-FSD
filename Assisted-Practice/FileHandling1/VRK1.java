package FileHandling1;


import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VRK1{

	public static void printWelcomeScreen(String ApplicationName, String DeveloperName) {

		System.out.println("     ***************************");
		System.out.println("\t*********************\n");

		System.out.println("\t Welcome to LOCK IT! ");
		System.out.println("\t By, Locker Pvt Ltd. \n");
		System.out.println("\t*********************");
		System.out.println("     ***************************\n");
		System.out.println("Application\t:"+ApplicationName+"\n");
		System.out.println("Developer\t:"+DeveloperName);
		
		
		/*System.out.println(appName+","+" this application is used  to :\n");
		
		System.out.println("     • Retrieve all files  in the \"main\" folder.\n");
		System.out.println("     • Search, add, or delete files in \"main\" folder.\n");
		System.out.println("\n  Please Ensure that , you provide the correct file name for searching or deleting files.\n");
		*/

		
	}
	
	public static void displayMenuScreen() {
		System.out.println("Select any option number from below (e.g.1/2/3)and press Enter\n");
		System.out.println(      "1) Retrieve all files inside \"main\" folder in assending order \n" );
		System.out.println(      "2) Display menu for File operations\n");
		System.out.println(      "3) Exit program\n");
		

	}

	public static void displayFileMenuOptions() {
		System.out.println("\n Select any optionfrom below(e.g.1/2/3/4/5) and press Enter \n");
		System.out.println(      "1) Add a file to \"main\" folder\n");
		System.out.println(      "2) Delete a file from \"main\" folder\n");
	    System.out.println(      "3) Search for a file from \"main\" folder\n");
	    System.out.println(      "4) Show Previous Menu  or go to menu \n"); 
	    System.out.println(      "5) Exit program\n");

		
	}
	//File Operations
	public class FileOperations {

		public static void createMainFolderIfNotExist(String folderName) {
			File theFile = new File("C:/Users/Y Shankar Reddy/eclipse-workspace/Phase-1");

			
		}

		public static void displayAllFiles(String path) {
			FileOperations.createMainFolderIfNotExist("main");
			// All required files and folders inside "main" folder relative to current
			
			System.out.println("Displaying all files with directory in ascending order\n");

			// listFilesInDirectory displays files along with folder structure
			List<String> ListFilesNames = FileOperations.FilesListInDirectory(path, 0, new ArrayList<String>());

			System.out.println("Displaying all files in ascending order\n");
			Collections.sort(ListFilesNames);

			ListFilesNames.stream().forEach(System.out::println);
		}

		public static List<String> FilesListInDirectory(String path, int inisalisationCount, List<String> fileNames) {
			File dir = new File(path);
			File[] theFiles = dir.listFiles();
			List<File> filesList = Arrays.asList(theFiles);

			Collections.sort(filesList);

			if (theFiles != null && theFiles.length > 0) {
				for (File thefiles : filesList) {

					System.out.print(" ".repeat(inisalisationCount * 2));

					if (thefiles.isDirectory()) {
						System.out.println("`-- " + thefiles.getName());

						// Recursively indent and display the files
						fileNames.add(thefiles.getName());
						FilesListInDirectory(thefiles.getAbsolutePath(), inisalisationCount + 1, fileNames);
					} else {
						System.out.println("|-- " + thefiles.getName());
						fileNames.add(thefiles.getName());
					}
				}
			} else {
				System.out.print(" ".repeat(inisalisationCount * 2));
				System.out.println("|-- Empty Directory");
			}
			System.out.println();
			return fileNames;
		}

		public static void createFiles(String Addfile, Scanner scan) {
			FileOperations.createMainFolderIfNotExist("main");
			Path FilePath = Paths.get("./main/" + Addfile);
			try {
				Files.createDirectories(FilePath.getParent());
				Files.createFile(FilePath);
				System.out.println(Addfile + " File created successfully.....");

				System.out.println("Would you like to add some content/message to the file? (yes/no)");
				String choice = scan.next();

				
				
				if (choice.equals("yes")) {
					System.out.println("\n\n Insert content and press enter:  \n");
					String content=scan.next();
					Files.write(FilePath, content.getBytes());
					System.out.println("\n Content written to file " + content);
					
					System.out.println("Content can be read using Notepad or Notepad++ or wordpad or MS Word...");
				}
				
			} catch (IOException e) {
				System.out.println("Failed to create file " + Addfile);
				System.out.println(e.getClass().getName());
			}
		}

		public static List<String> displayFileLocations(String fileName, String path) {
			List<String> fileListNames = new ArrayList<>();
			FileOperations.searchFileRepetitive(path, fileName, fileListNames);

			if (fileListNames.isEmpty()) {
				System.out.println("\n Couldn't find any file with given file name \"" + fileName + "\n");
			} else {
				System.out.println("\n Found file at below location(s):");

				List<String> files = IntStream.range(0, fileListNames.size())
						.mapToObj(index -> (index + 1) + ": " + fileListNames.get(index)).collect(Collectors.toList());

				files.forEach(System.out::println);
			}

			return fileListNames;
		}

		public static void searchFileRepetitive(String path, String fileName, List<String> fileListNames) {
			File dir = new File(path);
			File[] files = dir.listFiles();
			List<File> filesList = Arrays.asList(files);

			if (files != null && files.length > 0) {
				for (File file : filesList) {

					if (file.getName().startsWith(fileName)) {
						fileListNames.add(file.getAbsolutePath());
					}

					// Need to search in directories separately to ensure all files of required
					// fileName are searched
					if (file.isDirectory()) {
						searchFileRepetitive(path, fileName, fileListNames);
					}
				}
			}
		}

		public static void deleteFileRepitatively(String path) {

			File currentFile = new File(path);
			File[] thefiles = currentFile.listFiles();

			if (thefiles != null && thefiles.length > 0) {
				for (File file : thefiles) {

					String fileName = file.getName() + " at " + file.getParent();
					if (file.isDirectory()) {
						deleteFileRepitatively(path);
					}

					if (file.delete()) {
						System.out.println(fileName + " file deleted successfully");
					} else {
						System.out.println("Failed to delete file" + fileName);
					}
				}
			}

			String currentFileName = currentFile.getName() + " at " + currentFile.getParent();
			if (currentFile.delete()) {
				System.out.println(currentFileName + " file deleted successfully");
			} else {
				System.out.println("Failed to delete file " + currentFileName);
			}
		}
	}
	//FILE HANDLE
	public class FileHandleOption {
		public static void handleWelcomeScreenInput() {
			boolean flag = true;
			Scanner scan = new Scanner(System.in);
			do {
				try {
					VKR.displayMenuScreen();
					int option = scan.nextInt();

					switch (option) {
					case 1:
						FileOperations.displayAllFiles("main");
						break;
					case 2:
						FileHandleOption.handleFileMenuOptions();
						break;
					case 3:
						System.out.println("Program exited successfully....");
						flag = false;
						scan.close();
						System.exit(0);
						break;
					default:
						System.out.println("Please select a valid option from above.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					handleWelcomeScreenInput();
				} 
			} while (flag== true);
		}
		
		public static void handleFileMenuOptions() {
			boolean flag = true;
			Scanner scanner = new Scanner(System.in);
			do {
				try {
					VKR.displayFileMenuOptions();
					FileOperations.createMainFolderIfNotExist("main");
					
					int option = scanner.nextInt();
					switch (option) {
					case 1:
						// File Add
						System.out.println("Enter the name of the file to be added to the \"main\" folder");
						String Addfile = scanner.next();
						
						FileOperations.createFiles(Addfile, scanner);
						
						break;
					case 2:
						// File/Folder delete
						System.out.println("Enter the name of the file to be deleted from \"main\" folder");
						String fileToDelete = scanner.next();
						
						FileOperations.createMainFolderIfNotExist("main");
						List<String> Deletefiles = FileOperations.displayFileLocations(fileToDelete, "main");
						
						String deletionPrompt = "\n Select index of which file to delete?"
								+ "\n(Enter 0 if you want to delete all elements)";
						System.out.println(deletionPrompt);
					
						int input = scanner.nextInt();
						
						if (input != 0) {
							FileOperations.deleteFileRepitatively(Deletefiles.get(input - 1));
						} else {
							
							// If input == 0, delete all files displayed for the name
							for (String path : Deletefiles) {
								FileOperations.deleteFileRepitatively(path);
							}
						}
						

						break;
					case 3:
						// File/Folder Search
						System.out.println("Enter the name of the file to be searched from \"main\" folder");
						String thefileName = scanner.next();
						
						FileOperations.createMainFolderIfNotExist("main");
						FileOperations.displayFileLocations(thefileName, "main");

						
						break;
					case 4:
						// Go to Previous menu
						return ;
						
					case 5:
						// Exit
						System.out.println("Program exited successfully...");
						flag = false;
						scanner.close();
						System.exit(0);
					default:
						System.out.println("Please select a valid option from above.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					handleFileMenuOptions();
				}
			} while (flag == true);
		}
	}
	
	//MAIN FUNC
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotExist("main");
		
		VKR.printWelcomeScreen("LockedMe.com", "Shankar Reddy Y");
		
		FileHandleOption.handleWelcomeScreenInput();
	}

}