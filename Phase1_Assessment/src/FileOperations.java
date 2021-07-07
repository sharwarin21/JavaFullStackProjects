import java.io.File;
import java.util.Scanner;

public class FileOperations {
	public void getAllFiles()
	{
		Scanner scanFile=new Scanner(System.in); 
		System.out.println("Enter path of Directory:");
		String dirPath=scanFile.nextLine();
		File dir=new File(dirPath);
		File[] filesList=dir.listFiles();
		if(filesList.length!=0)
		{
			System.out.println("Files present in path:"+dirPath);
			for(int i=0;i<filesList.length;i++)
				System.out.println(filesList[i].getName());
		}
		else
			System.out.println("No Files present in path:"+dirPath);
	}
}
