import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LOCKEDME.COM");
		System.out.println("Phase 1:Implement Object Oriented Programming Using JAVA With Data Structures And Beyond");
		System.out.println("Application Name:Virtual Key For Your Repositories");
		System.out.println("Developer:Sharwari Nemane");
		appMenu();
		
		
	}
	public static void appMenu()
	{
		Scanner scanMenu=new Scanner(System.in);
		String menuChoice;
		while(true)
		{
			System.out.println("_________________________________________________________________________________________");
			System.out.println("*Application Menu*");
			System.out.println("1.Retrieve file names in ascending order.");
			System.out.println("2.Business level operations(add/delete/search).");
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
	public static void fileOperations()
	{
		Scanner scanFO=new Scanner(System.in);
		String fOChoice;
		while(true)
		{
			System.out.println("*Business level operations*");
			System.out.println("1.Add a File.");
			System.out.println("2.Delete a File.");
			System.out.println("3.Search a File.");
			System.out.println("4.Return to Application Menu.");
			System.out.println("Enter your choice:");
			fOChoice=scanFO.nextLine();
			switch(fOChoice)
			{
				case "1":System.out.println("Add");
					break;
				case "2":System.out.println("Delete");
					break;
				case "3":System.out.println("Search");
					break;
				case "4":System.out.println("Returning to Application Menu...");
					return;
				default:System.out.println("Enter valid choice");
					break;
			}	
		}
	}
}
