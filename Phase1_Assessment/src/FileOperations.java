import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperations 
{
	
	public void getAllFiles()
	{
		Scanner scanFile=new Scanner(System.in); 
		System.out.println("Enter path of Directory:");
		String dirPath=scanFile.nextLine();
		File dir=new File(dirPath);
		if(!dir.exists())
		{
			System.out.println("No such Directory exists!");
			return;
		}
		else
		{	File[] filesList=dir.listFiles();
			if(filesList.length!=0)
			{
				System.out.println("Files present in path:"+dirPath);
				for(int i=0;i<filesList.length;i++)
					System.out.println(filesList[i].getName());
			}
			else
			{
				System.out.println("No Files present in path:"+dirPath);
			}
		}
	}	
	
	public void addNewFile() throws IOException
	{
		Scanner scanAdd=new Scanner(System.in);
		System.out.println("Enter the path where you want to create new File:");
		String dirPath=scanAdd.nextLine();
		File dir=new File(dirPath);
		if(!dir.exists())
		{
			System.out.println("No such Directory exists!");
			return;
		}
		else
		{
			System.out.println("Enter File Name to be created:");
			String fileName=scanAdd.nextLine();
			File file=new File(dirPath,fileName);
			if(file.createNewFile())	
			{
				System.out.println("New File has been created");
			}
			else
			{
				System.out.println("Could not create new file");
			}
		}
	}
	
	public void writeInFile() throws IOException, InterruptedException
	{
		Scanner scanWrite=new Scanner(System.in);
		System.out.println("Enter the path from where you want to write in a File:");
		String dirPath=scanWrite.nextLine(); 
		File dir=new File(dirPath);
		if(!dir.exists()) 
		{
			System.out.println("No such Directory exists!"); 
			return;
		} 
		else 
		{ 
			System.out.println("Enter name of File to write in:"); 
			String fileName=scanWrite.nextLine(); 
			File file=new File(dirPath,fileName);
			if(file.exists()) 
			{ 
				FileWriter fw=new FileWriter(file,true);
				System.out.println("Enter contents to write in File:");
				String writeString=scanWrite.nextLine();
				PrintWriter pw=new PrintWriter(fw);
				pw.println(writeString);
				pw.close();
				System.out.println("Successfully written."); 
			} 
			else
			{
				System.out.println("No such File exists!"); 
			}
		}
	}
	
	public void readFromFile() throws IOException
	{
		Scanner scanRead=new Scanner(System.in);
		System.out.println("Enter the path from where you want to read from a File:");
		String dirPath=scanRead.nextLine();
		File dir=new File(dirPath);
		if(!dir.exists())
		{
			System.out.println("No such Directory exists!");
			return;
		}
		else
		{
			System.out.println("Enter name of File to read from:");
			String fileName=scanRead.nextLine();
			File file=new File(dirPath,fileName);
			if(file.exists())
			{
				System.out.println("File contains:");
				int ch;
				FileReader fr=new FileReader(file);
				while((ch=fr.read())!=-1)
				{
					System.out.print((char)ch);
				}
				fr.close();
				System.out.println();
			}
			else
			{
				System.out.println("No such File exists!");
			}
		}
	}
	
	public void deleteFile()
	{
		Scanner scanDel=new Scanner(System.in);
		System.out.println("Enter the path from where you want to delete a File:");
		String dirPath=scanDel.nextLine();
		File dir=new File(dirPath);
		if(!dir.exists())
		{
			System.out.println("No such Directory exists!");
			return;
		}
		else
		{
			System.out.println("Enter name of File to be deleted:");
			String fileName=scanDel.nextLine();
			File file=new File(dirPath,fileName);
			if(file.exists())
			{
				if(file.delete())
				{
					System.out.println("File has been deleted");
				}
				else
				{
					System.out.println("Could not delete file");
				}
			}
			else
			{
				System.out.println("No such File exists!");
			}
		}
	}
	
	public void searchFile()
	{
		Scanner scanSear=new Scanner(System.in); 
		System.out.println("Enter path of Directory:");
		String dirPath=scanSear.nextLine();
		File dir=new File(dirPath);
		if(!dir.exists())
		{
			System.out.println("No such Directory exists!");
			return;
		}
		else
		{	
			File[] filesList=dir.listFiles();
			if(filesList.length!=0)
			{
				System.out.println("Enter name of File to search:");
				String fileName=scanSear.nextLine();
				for(int i=0;i<filesList.length;i++)
				{
					if(filesList[i].getName().equals(fileName))
					{
						System.out.println("File found at given path!");
						return;
					}
				}
				System.out.println("No such File found");
			}
			else
				System.out.println("No Files present in path:"+dirPath);
		}
	}
	
}
