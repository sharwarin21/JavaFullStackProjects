import java.io.IOException;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		System.out.println("LOCKEDME.COM");
		System.out.println("Phase 1:Implement Object Oriented Programming Using JAVA With Data Structures And Beyond");
		System.out.println("Application Name:Virtual Key For Your Repositories");
		System.out.println("Developer:Sharwari Nemane");
		appMenu();
	}
	
	public static void appMenu() throws IOException, InterruptedException
	{
		Scanner scanMenu=new Scanner(System.in);
		String menuChoice;
		while(true)
		{
			System.out.println("_________________________________________________________________________________________");
			System.out.println("*Application Menu*");
			System.out.println("1.Retrieve file names in ascending order.");
			System.out.println("2.Business level operations(add/write/read/delete/search).");
			System.out.println("3.Close the application.");
			System.out.println("Enter your choice:");
			menuChoice=scanMenu.nextLine();
			System.out.println("___________________________________________________");
			switch(menuChoice)
			{
				case "1":getAllFiles();
					break;
				case "2":fileOperations();
					break;
				case "3":System.out.println("Closing the application...");
					return;
				default:System.out.println("Enter valid choice.");
					break;
			}
		}
	}
	
	public static void getAllFiles() 
	{
		System.out.println("*Retrieve file names in ascending order*");
		FileOperations fo=new FileOperations();
		fo.getAllFiles();
	}
	
	public static void fileOperations() throws IOException, InterruptedException
	{
		Scanner scanFO=new Scanner(System.in);
		String fOChoice;
		while(true)
		{
			System.out.println("__________________________________");
			System.out.println("*Business level operations*");
			System.out.println("1.Add a File.");
			System.out.println("2.Write in a File.");
			System.out.println("3.Read from a File.");
			System.out.println("4.Delete a File.");
			System.out.println("5.Search a File.");
			System.out.println("6.Return to Application Menu.");
			System.out.println("Enter your choice:");
			fOChoice=scanFO.nextLine();
			switch(fOChoice)
			{
				case "1":System.out.println("*Add a File*");
					FileOperations add=new FileOperations();
					add.addNewFile();
					break;
				case "2":System.out.println("*Write in a File*");
					FileOperations write=new FileOperations();
					write.writeInFile();
					break;
				case "3":System.out.println("*Read from a File*");
					FileOperations read=new FileOperations();
					read.readFromFile();
					break;
				case "4":System.out.println("*Delete a File*");
					FileOperations del=new FileOperations();
					del.deleteFile();
					break;
				case "5":System.out.println("*Search a File*");
					FileOperations sear=new FileOperations();
					sear.searchFile();
					break;
				case "6":System.out.println("Returning to Application Menu...");
					return;
				default:System.out.println("Enter valid choice.");
					break;
			}	
		}
	}
	
}
