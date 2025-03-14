package oopsConcept;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{
	
	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./TestData/abc.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("lang"));
		System.out.println(prop.get("automation"));
		
	}

	public static void writedata() throws Exception
	{
		File f = new File("./TestData/data12.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nthis is forth line of code");
		fw.flush();
		fw.close();
		
	}
	
	public static void readfile() throws Exception
	{
		//File f = new File("C:\\TestData\\data.txt");
		
		File f = new File("./TestData/data.txt");
		FileReader fr = new FileReader(f);
		
		
		int r = fr.read();
		
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
		}
		
		
		/*
		System.out.print((char)r);
		
		r = fr.read();
		
		System.out.print((char)r);
		
		r = fr.read();
		
		System.out.print((char)r);
		*/
		
	}
	
	public static void main(String[] args) throws Exception {
		readprop();
		
	}
	
}
