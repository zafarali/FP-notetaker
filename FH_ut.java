import java.util.*;
import java.io.*;

public class FH_ut{
 //FH_ut = file handler utilities
 /*This class contains utilities which have try/catch in them so you do not
 *need to implement this in the main program
  * Zafarali Ahmed 2013
  * */
  
  /*This method converts a txt file seperated by lines into a arraylist
   * 
   * */
    public static ArrayList<String> fileToArrayList(String filename){
    BufferedReader rd = createFileConnection(filename);
    ArrayList<String> list = new ArrayList<String>();
    String line = "";
    try{
      while(line!=null){
        line = rd.readLine();
        if(line!=null){
          list.add(line);
        }else{
         rd.close(); 
        }
      }
    }catch(IOException ex){
      
    }
    return list;
  }//fileToArrayList ends
   
    public static int arrayListToFile(ArrayList<String> tbs, String filename){
    int linesAdded = 0;
    String line = "";
    try {
    PrintWriter wr  = new PrintWriter(new FileWriter(filename));

    for(int i =0; i < tbs.size() && line!=null; i++){
    line = tbs.get(i);
    wr.println(line);
    linesAdded = i;
    }
    wr.close();

    } catch (IOException ex){
    linesAdded = -1;
    }
      return linesAdded;
    }
   
  //This method reads the whole file into a string and returns it. 
  //Note the buffered reader must be given here
  //pass in createFileConnection into the parameters with the file name to automate this process
    public static String readWholeFile(BufferedReader rd){
    String line = "";
    String contents = "";
    try {
      while(line!=null){
       line = rd.readLine();  
       if(line!=null){
       contents = contents+"\n"+line;
       }else{
        rd.close(); 
       }
      }//end while loop
    }catch(IOException ex){

    }

    return contents;
  }//end readWholeFile
    
  //This method creates a file connection safely and returns a buffered reader.
    public static BufferedReader createFileConnection(String filename){
    BufferedReader rd = null;
    try{
     rd = new BufferedReader(new FileReader(filename)); 
     return rd;
    } catch (IOException ex){
     
    }
     return null;
  }//end createFileConnection
}
