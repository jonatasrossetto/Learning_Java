package estudo17TextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// simple writing and reading from a txt file
		//writing section
		try {
		      FileWriter myWriter = new FileWriter("teste.txt");
		      myWriter.write("Hey I am writing a file!!!! \n");
		      for (int i=0;i<10;i++) {
		    	  myWriter.write("This is line "+i+"\n");
		      }
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		//reading section
		try {
		      File myObj = new File("teste.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		
		 
	}

}
