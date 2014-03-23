import java.util.*;
public class AL_ut{
  /*This class contains ArrayList utilities 
   * 
   * 
   **/
  
  //This method prints the list of arrays with each member on sperate lines.
    public static void printList(ArrayList<String> list){
    for(int i= 0; i < list.size(); i++){
     System.out.println(list.get(i)); 
    } 
  }//end printlist
    
   
 /* //This method prints the list of arraylist with each member seperated by spaces
   public static void showList(ArrayList<String> list){
    for(int i= 0; i < list.size(); i++){
     System.out.println(list.get(i)); 
    } 
  }//end printlist
        */
    
    
  //This method returns a random entry from an array list of strings
   public static String pickRandom(ArrayList<String> list){
   return list.get(ut.rando(list.size()));
  }
}//end AL_ut