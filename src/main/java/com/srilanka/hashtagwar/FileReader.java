package com.srilanka.hashtagwar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	public static String readFile() {
		
		String content="";

		 File file = new File("src\\main\\resources\\message.txt");
		    Scanner sc;
			try {
				sc = new Scanner(file);
				
				while (sc.hasNextLine())
				      content+= sc.nextLine();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return content;	
}
	

}
