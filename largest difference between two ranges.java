
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int L=sc.nextInt();
		int R=sc.nextInt();
		int a=0;
		int max =0;
		for(int i=L;i<R;i++)
		{
		    int count=0;
		    for(int j=1;j<=i;j++)
		    {
		        if(i%j ==0 )
		        {
		            count++;
		        }
		    }
		    if(count == 2)
		    {
		        a++;
		    }
		    
		}
		int[] arr = new int[a];
		a=0;
		for(int i=L;i<R;i++)
		{
		    int count=0;
		    for(int j=1;j<=i;j++)
		    {
		        if(i%j ==0 )
		        {
		            count++;
		        }
		    }
		    if(count == 2)
		    {
		        arr[a]=i;
		       
		        a++;
		    }
		    
		}
		for (int i=1;i<arr.length;i++)
		{
		    int d = arr[i] - arr[i-1];
		    if(max<=d){
		        max=d;
		        
		    }
		    
		}
			for (int i=1;i<arr.length;i++)
		{     
		    int d =arr[i] - arr[i-1];
		    if(max==d)
		    {
		        System.out.println(arr[i-1]);
		        System.out.print(arr[i]);
		    }
		    
		}
	
	}
}
