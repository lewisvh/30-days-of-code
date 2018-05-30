import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        ArrayList<String> namesList = new ArrayList<String>();
      
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if(emailID.contains("@gmail")) {
              namesList.add(firstName);
            }
        }
        scanner.close();
      
      Collections.sort(namesList);
      
      for(int i = 0; i < namesList.size(); i++){
        System.out.println(namesList.get(i));
      }
    }
}