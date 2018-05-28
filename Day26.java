import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    int lateFee       = 0;
    Scanner sc      = new Scanner(System.in);
    int dayReturn   = sc.nextInt();
    int monthReturn = sc.nextInt();
    int yearReturn  = sc.nextInt();
    int dayDue      = sc.nextInt();
    int monthDue    = sc.nextInt();
    int yearDue     = sc.nextInt();

    if(yearReturn < yearDue){ 
        lateFee=0;
    } else{
        if(yearReturn > yearDue){
            lateFee=10000;
        }else if(monthReturn > monthDue){
            lateFee=500 * (monthReturn - monthDue);
        }else if(dayReturn > dayDue){
            lateFee=15 * (dayReturn - dayDue);
        }
    }              
    System.out.println(lateFee);       
    }
}