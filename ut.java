import java.util.*;
/*This class contains supplementary utilities to make the main FP program work
 * ~ Zafarali Ahmed 2013
 * */

public class ut{
  //returns locationof the word in the string
  public static int locationOfWord(String[] array, String word){
  int location = 0;
  boolean found = false;
  for(int i =0; i<array.length && !found; i++){
    if(word.equals(array[i])){
      location = i;
      found = true;
    }
  }
  return location;
  }//end locationOfMinimumValue
  /*the printArray method prints all members of an int array
   * */
  public static void printArray(int[] array1){
  String toBePrinted = "{";
  for(int i=0;i<array1.length;i++){
  toBePrinted += array1[i];
  if(i>=0 && i<(array1.length-1)){
  toBePrinted += ", ";
  }
  }
  toBePrinted +="}";
  System.out.println(toBePrinted);
  }//end printArray
  
  /*the rando method gets a whole round number within a maximum range from 0 to a number of choice
   * */
  public static int rando(int max){
  return (int) (Math.random()*max);
  }//rando end 
}//ut end
