import java.io.*;
import java.util.*;
 // task for printing the sentence after the occurrence of letter.
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc1 = new Scanner (System.in);	// for string input 
    Scanner sc2 = new Scanner (System.in);	// for character input
    // ask user to enter a sentence 
      System.out.print ("Sentence :");
    String sentence = sc1.nextLine ();
    // ask user to enter a character
      System.out.print ("Letter: ");
    char letter = sc1.next ().charAt (0);
    int len = sentence.length ();	// to store the result                
    String subString = "";	// to find out whether the character is present or not              
    boolean result = false;
    for (int i = 0; i < len; i++)
      {
	char c = sentence.charAt (i);
	// comparing current character and input character if both are equal                    
	// we will find the substring and end the loop using break statement.                   
	if (Character.compare (letter, c) == 0)
	  {
	    subString = sentence.substring (i + 1, len);
	    result = true;
	    break;

	  }
      }
    // if result is true then print the substring                
    if (result == true)
      System.out.println ("Result: " + subString);
    // if result is not true print this statement               
    else
      System.out.println ("The letter does not exist in the sentence.");

  }
}