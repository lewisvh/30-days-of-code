import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        int total_cost = (int)Math.round(((meal_cost * ((double)tip_percent/100)) + (meal_cost * ((double)tax_percent/100)) + meal_cost));
        in.close();
        
        System.out.println("The total meal cost is " + total_cost + " dollars.");
    }
}