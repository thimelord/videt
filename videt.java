/**
  *
  * description: videt-core
  *
  * @version 0.1.0 from 23.07.2014
  * @author thimelord
  */

import java.io.*;
import java.lang.Exception;

public class videt {
  public static void main(String args[])
  {
    BufferedReader bfIn = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("====================\nWelcome to videt - very important data encryption tool\n====================\n\n Which algorythm do you want to use?\n [1] Caesar\n");
    int iInput = 0;
    try { 
      iInput = bfIn.read()-48;
    } catch(Exception e) {
      e.printStackTrace();
    } // end of try
    switch (iInput) {
      case 1 : 
      String sText = "";
      int iNumb = 0;
      System.out.print("please enter the text to encrypt (only letters):\n");
      try { 
        sText = bfIn.readLine();
        System.out.print("how far do you want to move? >");
        iNumb = bfIn.read()-48;
      } catch(Exception e) {
        System.out.print("Wrong input!");
        e.printStackTrace();
      } // end of try
      String sEnc_Text = caesar(sText, iNumb);
      System.out.println(sEnc_Text);
      break;
      //case  : 
      //  
      //  break;
      default: 
      System.out.println("Wrong input, please startover!");
    } // end of switch    
  } // end of main
  
  // function caesar(String in, int v) added by BigRob 
  public static String caesar(String in, int v) {
    String out = "";
    for (char c : in.toUpperCase().toCharArray()) {
      if (Character.getNumericValue(c) >= 10 && Character.getNumericValue(c) <= 35)  {out += ((char) ((Character.getNumericValue(c)+v-10)%26+65));}
    } // end of for
    return out;
  } // end of caesar
} // end of videt 
