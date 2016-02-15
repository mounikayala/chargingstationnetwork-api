package com.homeaway.test.transportation_api.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.IOUtils;

public class FileUtil {
	public void writeIdToFile(String id){
		PrintWriter writer;
		try {
			writer = new PrintWriter("id-file.txt", "UTF-8");
			writer.println(id);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String readIdFromFile(){
		String stationId = null;
		try {
			FileInputStream inputStream = new FileInputStream("id-file.txt");
			stationId = IOUtils.toString(inputStream);
		    inputStream.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		return stationId;
	}
}
