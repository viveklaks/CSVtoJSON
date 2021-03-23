
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class ScannerExample {
	public static void main(String args[]) throws FileNotFoundException{  
	 Scanner in = new Scanner(new File("SampleCsv.csv"));  
	 in.useDelimiter(","); 
	 String FirstLine = in.nextLine(); 
	 Scanner inFirst = new Scanner(FirstLine);
	 
	  
	 inFirst.useDelimiter(",");
	 List<String> list = new ArrayList<String>();
	 while(inFirst.hasNext()) { 
	     String keys = inFirst.next();
	     list.add(keys);
	                
	                 
	     }
	 
		
	 String values;
	 System.out.println("[\n");
	 while(in.hasNext()) { 
     String name = in.nextLine(); 
     Scanner inKeys = new Scanner(name);
     inKeys.useDelimiter(",");
     System.out.println("  {\n");
     
     for(int i =0;i<list.size();i++) {
	     values = inKeys.next();
	     System.out.println("     "+'"'+list.get(i)+'"'+":"+'"'+values+'"');             
	                 
     }System.out.println(" }\n");  }        
                 
     in.close();System.out.println("]\n"); }  }
