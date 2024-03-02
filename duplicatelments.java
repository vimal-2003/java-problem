import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] a = {1,4,93,93,0,9,2,3,5,3,3};
		 HashSet<Integer> ans = new HashSet<>();
		 for(int i : a)
		 {
		     ans.add(i);
		 }
		 System.out.print(ans);
}
}
