import java.util.Scanner;


public class InsertionSort {

	
	public static void main(String[] args) {
		int r,temp;
		Scanner ob=new Scanner (System.in);
		System.out.println("Enter number");
		 r=ob.nextInt();
		 System.out.println("Enter elements for sorting:");
		 int b[]=new int[100];
		 for(int p=0;p<r;p++)
		 {
			 b[p]=ob.nextInt();
		 }
		 for(int p=0;p<r;p++)
		 {
			 for(int q=p;q>0;q--)
			 {
			 
			if (b[q]<b[q-1])
			 {
                 temp = b[q];
                 b[q] = b[q-1];
                 b[q-1] = temp;
 
			 }
			 
		 }
		 }
		 System.out.println("Elements after sorting"); 
		 for(int p=0;p<r;p++)
		 {
			 System.out.println(b[p]);  
		 }
	}

}
