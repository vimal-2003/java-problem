import java.util.Scanner;
import java.util.*;
public class Main
{ 
   static int secSmallest(int arr[], int n)
   {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int i=0; i < n; i++){
            if(arr[i] < first)
            { 
             second = first; 
             first = arr[i]; 
            
            } 
            else if(second>arr[i])
           second = arr[i];
        }

        return second;
   }
   public static void main(String args[])
   {
      int arr[] = {12, 13, 1, 10, 34, 10};
      int n = arr.length;
      System.out.print(secSmallest(arr, n)); 
   }
}
