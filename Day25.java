import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
  /* Enter your code here. */
    Scanner sc =new Scanner(System.in);
    int total=sc.nextInt();
    for(int i=0;i<total;i++){
        int num=sc.nextInt();
        boolean bool=prime(num);
        if(bool){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
  public static boolean prime(int num){
    if(num == 1){
        return false;
    }
    else if(num == 2){
        return true;
    }
    for(int i = 2; i*i<=num; i++){
        if(num % i == 0){
            return false;
        }
    }
    return true;
  }
}
