import java.util.*;

public class NoteTaker{
  private static int slideNumber = 1;
  private static ArrayList<String> linesList;
  private static String filename;
  public static void main(String[] args){
    boolean exit = false;
    System.out.println("  /$$$$$$  /$$   /$$ /$$$$$$$ ");
    System.out.println(" /$$__  $$| $$  | $$| $$__  $$");
    System.out.println("| $$  \\__/| $$  | $$| $$  \\ $$");
    System.out.println("|  $$$$$$ | $$  | $$| $$$$$$$/");
    System.out.println(" \\____  $$| $$  | $$| $$____/ ");
    System.out.println(" /$$  \\ $$| $$  | $$| $$      ");
    System.out.println("|  $$$$$$/|  $$$$$$/| $$      ");
    System.out.println(" \\______/  \\______/ |__/      ");
    System.out.println("Welcome!");
    Scanner kr = new Scanner(System.in);
    //get the boring loading stuff out of the way
    System.out.println("Would you like to load a note?\n Type in the file name or enter to continue");
    filename = kr.nextLine();
    if(!(filename).equals("")){
     filename = filename+".txt";
     linesList = load();
     String[] tmp = linesList.get((linesList.size()-1)).split(":");
     String[] tmp2 = tmp[0].split("\\s+");
     
     slideNumber = Integer.parseInt(tmp2[1]);
     System.out.println(linesList.size()+" lines loaded from "+filename+" starting at slide: "+slideNumber);
    }else{
     System.out.println("What is the name of this note?"); 
     filename = kr.nextLine()+".txt";
     linesList = new ArrayList<String>();
     System.out.println("Now saving to: "+filename);
   }
    String line;
    //this loop keeps allowing you to type in a line corresponding to what the professor says
    while(!exit){
      System.out.println("What is the professor saying on slide "+slideNumber+"?");
      line = kr.nextLine();
      
      if(line.equals("save")){
        save();        
      }else if(line.equals("show note") || line.equals("sn")){
      System.out.println("Your note looks like this right now:");
        AL_ut.printList(linesList);
      }else if(line.equals("exit")){
        System.out.println("Bye!");
       exit = exit(); 
      }else if(line.equals("change slide") || line.equals("cs")){
        System.out.println("What do you want to change the slide to?");
        slideNumber = kr.nextInt();
      }else if(line.equals("next slide") || line.equals("ns")){
        slideNumber++;
      }else if(line.equals("previous slide") || line.equals("ps")){
        if(slideNumber>1){
        slideNumber--;
        }
      }else{
        if(!enterLine(line)){
          System.out.println("Line not added");
        }else{
            System.out.println("Line added");
        }
      }
    }
  }
  public static ArrayList<String> load(){
   return FH_ut.fileToArrayList(filename); 
  }
  public static void save(){
    int x = FH_ut.arrayListToFile(linesList, filename);
    if(x>0){
     System.out.println("Saved "+x+" lines"); 
    }
  }
  
  public static boolean enterLine(String line){
    if(line.equals("") || line.equals("\\s+") || line==null){
      return false;
    }else{
  linesList.add("Slide "+slideNumber+":"+line);
    return true;
    }
    }
  
  public static boolean exit(){
   return true; 
  }
}//end class