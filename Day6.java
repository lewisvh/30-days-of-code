import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner userInput        = new Scanner(System.in);
      int testCases            = userInput.nextInt();
      
      for(int i = 0; i < testCases; i++){
        String userString = userInput.next();
        String evenCharsInString = "";
        String oddCharsInString  = "";
        for(int j = 0; j < userString.length(); j++) {
          if(j % 2 == 0){
            evenCharsInString += userString.charAt(j);
          } else {
            oddCharsInString += userString.charAt(j);
          }
        }
        System.out.println(evenCharsInString + " " + oddCharsInString);
      }

      
    }
}