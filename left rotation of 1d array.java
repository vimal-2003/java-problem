import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size :");
        int n = sc.nextInt();
        System.out.print("Enter the how rotation in left :");
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         k = k % n;
        for (int j = 0; j < k; j++) {
            int temp = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i-1]= arr[i];
            }
            arr[n-1] = temp;
        }
        
       System.out.print(Arrays.toString(arr));
    }
}
