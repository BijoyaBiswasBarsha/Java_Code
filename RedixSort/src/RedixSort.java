
import java.util.Scanner;
 
public class RedixSort 
{
    public static void sort( int[] a)
    {
        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[10];
 
            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;        
        }
    }    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        int n, i;
        System.out.println("How many numbers:");
        n = scan.nextInt();
        int arr[] = new int[ n ];
        System.out.println("Enter "+ n +" numbers for sorting:");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        sort(arr);
        System.out.println("Elements after sorting ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();                     
    }    
}