package com.test.genrics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.opc.PackageProperties;

public class ReadProperties 
{

	public  Properties pro;
	public  ReadProperties()
	{
	

	try 
	{
		File	fil= new File(System.getProperty("user.dir")+"/src/test/resources/config.properties");
		 pro = new Properties();
	FileInputStream fis	  = new  FileInputStream(fil);
	     pro.load(fis);
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
		// TODO: handle exception
	}
	}
 
	public  String getUrl()
	{
		     return pro.getProperty("url");
	}	
	public String getUsername()
	{
		return pro.getProperty("username");
	}
	public String getPassword()
	{
		return pro.getProperty("password");
		
	}



}
