import java.util.Scanner;


public class BubbleSort {

	
	public static void main(String[] args) {
		int r,swap;
		Scanner ob=new Scanner (System.in);
		System.out.println("Enter number");
		 r=ob.nextInt();
		 System.out.println("Enter elements for sorting");
		 int b[]=new int[100];
		 for(int c=0;c<r;c++)
		 {
			 b[c]=ob.nextInt();
		 }
		 
		 for(int c=0;c<r-1;c++)
		 {
			 for(int d=0;d<r-c-1;d++)
			 {
				 if(b[d]>b[d+1])
				 {
					 swap=b[d];
					 b[d]=b[d+1];
					 b[d+1]=swap;
					 
				 }
			 }
		 }
		 System.out.println("Elements after sorting"); 
		 for(int c=0;c<r;c++)
		 {
			 System.out.println(b[c]);  
		 }
		 
	}

}
