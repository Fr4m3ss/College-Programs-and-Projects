//Francesco Messina, Assignment 4: File Viewer
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileViewer
{

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Scanner in = new Scanner(System.in);
		char flag;
		File f = null;
		String arg;
		String filedir;
		String sourceFile;
		String destFile;
		String[] fileList;
		if(args.length == 0)
		{
			flag = 'i';
			filedir = ".";
			if(flag == 'i')
			{
				f = new File(filedir);
				fileList = f.list();
				long[] fileSize = new long[fileList.length];
				File temp = null;
				System.out.println("Size Filename\n");
				for(int i = 0; i < fileList.length; i++)
				{
					temp = new File(fileList[i]);
					fileSize[i] = temp.length();
				}
				for(int i = 0; i < fileList.length; i++)
				{
					for(int j = 0; j < fileList.length; j++)
					{
						if(fileSize[i]<fileSize[j])
						{
						long temp1 = fileSize[j];
						fileSize[j] = fileSize[i];
						fileSize[i] = temp1;
						String temp2 = fileList[j];
						fileList[j] = fileList[i];
						fileList[i] = temp2;
						}
					}
				}
				for(int i = 0; i < fileList.length; i++)
				{
					System.out.println(fileSize[i] + " " + fileList[i]);
				}
			}	
			else
			{
				System.out.println("Usage: java -jar hw4.jar [-i [<file>|<directory>]|-v <file>|-c <sourceFile> <destFile>]");		
			}

		}
		else if(args.length == 1)
		{
			flag = args[0].charAt(1);
			filedir = ".";
			if(flag == 'i')
			{
				f = new File(filedir);
				fileList = f.list();
				long[] fileSize = new long[fileList.length];
				File temp = null;
				System.out.println("Size Filename\n");
				for(int i = 0; i < fileList.length; i++)
				{
					temp = new File(fileList[i]);
					fileSize[i] = temp.length();
				}
				for(int i = 0; i < fileList.length; i++)
				{
					for(int j = 0; j < fileList.length; j++)
					{
						if(fileSize[i]<fileSize[j])
						{
						long temp1 = fileSize[j];
						fileSize[j] = fileSize[i];
						fileSize[i] = temp1;
						String temp2 = fileList[j];
						fileList[j] = fileList[i];
						fileList[i] = temp2;
						}
					}
				}
				for(int i = 0; i < fileList.length; i++)
				{
					System.out.println(fileSize[i] + " " + fileList[i]);
				}
			}	
			else
			{
				System.out.println("Usage: java -jar hw4.jar [-i [<file>|<directory>]|-v <file>|-c <sourceFile> <destFile>]");		
			}
		}
		else if(args.length == 2)
		{
			flag = args[0].charAt(1);
			filedir = args[1];
			if(flag == 'i')
			{
				f = new File(filedir);
				fileList = f.list();
				if(f.isDirectory())
				{
					long[] fileSize = new long[fileList.length];
					File temp = null;
					System.out.println("Size Filename\n");
					for(int i = 0; i < fileList.length; i++)
					{
						temp = new File(filedir+fileList[i]);
						fileSize[i] = temp.length();
					}
					for(int i = 0; i < fileList.length; i++)
					{
						for(int j = 0; j < fileList.length; j++)
						{
							if(fileSize[i]<fileSize[j])
							{
							long temp1 = fileSize[j];
							fileSize[j] = fileSize[i];
							fileSize[i] = temp1;
							String temp2 = fileList[j];
							fileList[j] = fileList[i];
							fileList[i] = temp2;
							}
						}
					}
					for(int i = 0; i < fileList.length; i++)
					{
						System.out.println(fileSize[i] + " " + fileList[i]);
					}
				}
				else if(f.isFile())
				{
					SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM d hh:mm:ss");
					System.out.println("File Path: " + f.getAbsolutePath());
					System.out.println("Is executable? " + f.canExecute());
					System.out.println("Size: " + f.length() + " bytes");
					System.out.println("Last Modified Date: " + formatter.format(f.lastModified()));
				}
				else
				{
					System.out.println("Error: Invalid File");
				}
			}
			else if(flag == 'v')
			{
				f = new File(filedir);
				if(f.isFile())
				{
					Scanner text = new Scanner(f);
					while(text.hasNextLine())
					{
						System.out.println(text.nextLine());
					}
					text.close();
				}
				else
				{
					System.out.println("Error: Please Input A Valid File");
				}
			}
			else
			{
				System.out.println("Usage: java -jar hw4.jar [-i [<file>|<directory>]|-v <file>|-c <sourceFile> <destFile>]");		
			}


		}
		else if(args.length == 3)
		{
			flag = args[0].charAt(1);
			sourceFile = args[1];
			destFile = args[2];
			if(flag == 'c')
			{
				File source = new File(sourceFile);
				File dest = new File(destFile);
				if(source.isFile())
				{
					if(dest.createNewFile())
					{
						BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));
						Scanner text = new Scanner(source);
						while(text.hasNextLine())
						{
							writer.write(text.nextLine() + '\n');
						}
						text.close();
						writer.close();
						System.out.println("File " + sourceFile + " was copied to file " + destFile + " successfully. ");
					}
					else
					{
						System.out.println("File " + destFile + " already exists.");	
					}
				}
				else
				{
					System.out.println("Error: Please Input A Valid File");
				}
			}
			else
			{
				System.out.println("Usage: java -jar hw4.jar [-i [<file>|<directory>]|-v <file>|-c <sourceFile> <de    stFile>]");                     
			}
		}
	}

}
