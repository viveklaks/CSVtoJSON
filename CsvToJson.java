//csv to json in console
package com.ToJson;
import java.util.*;
import java.io.FileWriter;  
import java.io.IOException; 
import java.io.File;
import java.io.FileNotFoundException;
public class ScannerExample {
	public static void main(String args[]) throws FileNotFoundException{  
	 Scanner in = new Scanner(new File("SampleCsv.csv"));  
	 in.useDelimiter(","); 
	 String FirstLine = in.nextLine(); 
	 Scanner inFirst = new Scanner(FirstLine);
	 int count=0;
	  
	 inFirst.useDelimiter(",");
	 List<String> list = new ArrayList<String>();
	 while(inFirst.hasNext()) { 
	     String keys = inFirst.next();
	     list.add(keys);
	                
	                 
	     }
	 
		
	 String values;
	 try {
		 FileWriter myWriter = new FileWriter("CsvtoJson.html");
		 System.out.println("[\n");
		 myWriter.write("[\n");
		 while(in.hasNext()) { 
		 String name = in.nextLine(); 
         Scanner inKeys = new Scanner(name);
         inKeys.useDelimiter(",");
	 if(count!=0){
	 System.out.println("  ,");
	 }else{}		 
         System.out.println("  {\n");
         myWriter.write("  {\n");
     
         for(int i =0;i<list.size();i++) {
	       values = inKeys.next();
	       System.out.println("     "+'"'+list.get(i)+'"'+":"+'"'+values+'"');             
	       myWriter.write("     "+'"'+list.get(i)+'"'+":"+'"'+values+'"');             
	             
         }   
         System.out.println(" }\n"); 
         myWriter.write("  }\n");
	 count+=1;		 
         }        
		        
         in.close();System.out.println("]\n");
         myWriter.write("]\n");
	 	 
         myWriter.close();
         System.out.println(count); 
	 }
	  catch(IOException e) {
		 System.out.println("An error occurred.");
		 e.printStackTrace();
		 }
	 
	
	}  }
